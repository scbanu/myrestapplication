/**
 * 
 */
package com.myretail.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myretail.service.ProductService;
import com.myretail.service.beans.Product2Display;

/**
 * This class is responsible for performing the business logic and data integration.
 * 
 * @author Banu
 *
 */
@Component
public class ProductManager {

	@Autowired
	private ProductService productService;
	
	/**
	 * This method calls price repository and gets the price data from the database.
	 * It also calls product service to fetch the product name.
	 * It merges the data from both the data sources and provides ProductBO object.
	 * 
	 * @param productId Get details of the product identified by this parameter.
	 * @return ProductBO ProductBO
	 * @throws Throwable 
	 */
	public List<Product2Display> getProductDetails(Long productId, String showLabel) throws Throwable { 

		List<Product2Display> products = productService.getProductDetails(productId, showLabel);
		return products;
	}
	
	
}
