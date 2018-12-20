
package com.myretail.service.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "title",
    "colorSwatches",
    "nowPrice",
   
})
@JsonRootName("products")
public class Product2Display {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("nowPrice")
    private String nowPrice;
    @JsonProperty("title")
    private String title;
    @JsonProperty("ColorSwatches")
    private List<ColorSwatch2Display> colorSwatches = null;
    @JsonProperty("priceLabel")
    private String priceLabel;
    
    @JsonProperty("disocunt")
    private Double disocunt;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the colorSwatches
	 */
    @JsonProperty("ColorSwatches")
	public List<ColorSwatch2Display> getColorSwatches() {
		return colorSwatches;
	}

	/**
	 * @param colorSwatches the colorSwatches to set
	 */
    @JsonProperty("ColorSwatches")
	public void setColorSwatches(List<ColorSwatch2Display> colorSwatches) {
		this.colorSwatches =  colorSwatches;
	}

	/**
	 * @return the additionalProperties
	 */
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * @param additionalProperties the additionalProperties to set
	 */
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	/**
	 * @return the priceLabel
	 */
	public String getPriceLabel() {
		return priceLabel;
	}

	/**
	 * @param priceLabel the priceLabel to set
	 */
	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	/**
	 * @return the disocunt
	 */
	public Double getDisocunt() {
		return disocunt;
	}

	/**
	 * @param disocunt the disocunt to set
	 */
	public void setDisocunt(Double disocunt) {
		this.disocunt = disocunt;
	}

	
	/**
	 * @return the nowPrice
	 */
	public String getNowPrice() {
		return nowPrice;
	}

	/**
	 * @param nowPrice the nowPrice to set
	 */
	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product2Display [" + (productId != null ? "productId=" + productId + ", " : "")
				+ (title != null ? "title=" + title + ", " : "")
				+ (colorSwatches != null ? "colorSwatches=" + colorSwatches + ", " : "")
				+ (priceLabel != null ? "priceLabel=" + priceLabel + ", " : "")
				+ (disocunt != null ? "disocunt=" + disocunt : "") + "]";
	}

    
}
