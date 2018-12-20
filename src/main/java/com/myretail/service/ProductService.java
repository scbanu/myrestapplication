/**
 * 
 */
package com.myretail.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myretail.service.beans.ColorSwatch2Display;
import com.myretail.service.beans.Product2Display;
import com.myretail.utils.ColorConverter;
import com.myretail.utils.Constants;
import com.myretail.utils.MyJSONComparator;


/**
 * This class is responsible for performing a HTTP call to a third party API.
 * 
 * @author Banu
 *
 */
@Service
@PropertySource("classpath:global.properties")
public class ProductService {


	
	
	@Value("${endpoint.url}")
	private String baseURI; 
	@Value("${endpoint.suffix}")
	private String suffix;

	private RestTemplate restTemplate = new RestTemplate();
	
    private DecimalFormat f = new DecimalFormat("##.00");

	
	/**
	 * This method performs a HTTP GET call to an external service and get product details in JSON fromat.
	 * It responsible for converting the JSON string into an JSONObject and extracting the product information.
	 * 
	 * @param id
	 * @return Products
	 * @throws Throwable 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * @throws JSONException
	 */
	public List<Product2Display> extractProducts(Long id) throws JsonParseException, JsonMappingException, Throwable {
		return getProductDetails(id, null);
	}
	
	/**
	 * This method performs a HTTP GET call to an external service and get product details in JSON fromat.
	 * It responsible for converting the JSON string into an JSONObject and extracting the product information.
	 * 
	 * @param id
	 * @param showLabel
	 * @return Products
	 * @throws Throwable 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * @throws JSONException
	 */
	public List<Product2Display> getProductDetails(Long id, String showLabel) throws JsonParseException, JsonMappingException, Throwable  {

		String productJson = restTemplate.getForObject(baseURI+id+suffix, String.class);
		
		List<Product2Display> productsList = extractProducts(productJson, showLabel);

		return productsList;
	}
	
	/**
	 * Given a Products json string, the below method parses the json object and sets a new return domain object
	 * 
	 * @param productJson
	 * @param showLabel
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * 
	 */
	public List<Product2Display> extractProducts(String productJson, String showLabel) throws JsonParseException, JsonMappingException {

	    
		ObjectMapper objectMapper = new ObjectMapper();
		// get an array from the JSON object
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		List<Product2Display> productsList = new ArrayList<Product2Display>();

		JSONObject obj = new JSONObject(productJson);
		JSONArray arr = obj.getJSONArray("products");
		
		Product2Display product2Display = null;
		ColorSwatch2Display cs = null;
		List<ColorSwatch2Display> csList;
		JSONObject csObj = null;

		for (int i = 0; i < arr.length(); i++) {
			
		    product2Display = new Product2Display();
		    csList = new ArrayList<ColorSwatch2Display>();

		    String priceLabel  = "";
		    String nowPriceStr  = "";

		    JSONObject priceObject =  (JSONObject) arr.getJSONObject(i).get("price");
		    JSONArray colorSwatchArray =   arr.getJSONObject(i).getJSONArray("colorSwatches");
		    Object obj1 = priceObject.get("now");

		    if(obj1 instanceof JSONObject) {
		    	nowPriceStr = ((JSONObject)obj1).getString("from");
		    } else {
		    	nowPriceStr = priceObject.getString("now");
		    }
		    
		    Double wasPrice = (!priceObject.getString("was").isEmpty()) ? Double.valueOf(priceObject.getString("was").trim()): 0.00;
		    Double thenPrice = (!priceObject.getString("then1").isEmpty()) ? Double.valueOf(priceObject.getString("then1").trim()): 0.00;
		    Double nowPrice = (Double.valueOf(nowPriceStr));

			for(int j = 0; j< colorSwatchArray.length(); j++) {

		    	csObj = colorSwatchArray.getJSONObject(j);
		    	
		    	cs = new ColorSwatch2Display();
			    cs.setColor(csObj.getString("color"));
			    cs.setSkuId(csObj.getString("skuId"));
			    String rgbColorVal = ColorConverter.hashMapOfColors.get(csObj.getString("basicColor").toLowerCase());
				if(rgbColorVal == null)
					rgbColorVal = "UNDEFINED";
			    cs.setRgbColor(rgbColorVal);
			    csList.add(cs);

		    }
			
			Double newWas = (wasPrice > 0.00)? wasPrice: thenPrice > 0.00 ? thenPrice: nowPrice;
		    
		    if(showLabel == null || showLabel.trim().length() == 0 || Constants.SHOW_WAS_NOW.equalsIgnoreCase(showLabel.trim())) {
		    
		    	priceLabel = "Was £" + f.format(wasPrice) + ", now £" + f.format(nowPrice);
		    
		    } else if(Constants.SHOW_WAS_THEN_NOW.equalsIgnoreCase(showLabel.trim())) {
		    	
		    	priceLabel = "Was £" + wasPrice + ", Then £" + f.format(thenPrice) + ", now £" + f.format(nowPrice);
		    	
		    } else if(Constants.SHOW_PER_DISCOUNT.equalsIgnoreCase(showLabel.trim())) {
		    	
		    	priceLabel = f.format(((newWas - nowPrice)*100/newWas))+"% Off, now £" + f.format(nowPrice);
		    	
		    } else {
		    	
		    	priceLabel = "Was £" + f.format(wasPrice) + ", now £" + f.format(nowPrice);
		    }

		    product2Display.setProductId(arr.getJSONObject(i).getString("productId"));
		    product2Display.setTitle(arr.getJSONObject(i).getString("title"));
		    product2Display.setColorSwatches(csList);
		    product2Display.setPriceLabel(priceLabel);
		    product2Display.setNowPrice("£"+f.format(nowPrice));
		    product2Display.setDisocunt(Double.valueOf(f.format((newWas - nowPrice)*100/newWas)));
			productsList.add(product2Display);
		}

		//Sorting of Collection - Products basaesd on Discount factor
		Collections.sort(productsList, new MyJSONComparator());
		Collections.reverse(productsList);
		return productsList;
	}
	
}
