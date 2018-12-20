
package com.myretail.service.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "color",
    "basicColor",
    "colorSwatchUrl",
    "imageUrl",
    "isAvailable",
    "skuId"
})
public class ColorSwatch {

    @JsonProperty("color")
    private String color;
    @JsonProperty("basicColor")
    private String basicColor;
    @JsonProperty("colorSwatchUrl")
    private String colorSwatchUrl;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("isAvailable")
    private Boolean isAvailable;
    @JsonProperty("skuId")
    private String skuId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("basicColor")
    public String getBasicColor() {
        return basicColor;
    }

    @JsonProperty("basicColor")
    public void setBasicColor(String basicColor) {
        this.basicColor = basicColor;
    }

    @JsonProperty("colorSwatchUrl")
    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    @JsonProperty("colorSwatchUrl")
    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("isAvailable")
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    @JsonProperty("isAvailable")
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @JsonProperty("skuId")
    public String getSkuId() {
        return skuId;
    }

    @JsonProperty("skuId")
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
