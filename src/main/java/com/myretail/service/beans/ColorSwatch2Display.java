
package com.myretail.service.beans;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "color",
    "rgbColor",
    "skuId"
})
@JsonRootName("ColorSwatches")
public class ColorSwatch2Display {

    @JsonProperty("color")
    private String color;
    @JsonProperty("rgbColor")
    private String rgbColor;
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


    /**
	 * @return the rgbColor
	 */
	public String getRgbColor() {
		return rgbColor;
	}

	/**
	 * @param rgbColor the rgbColor to set
	 */
	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final int maxLen = 10;
		return "ColorSwatch2Display [" + (color != null ? "color=" + color + ", " : "")
				+ (rgbColor != null ? "rgbColor=" + rgbColor + ", " : "")
				+ (skuId != null ? "skuId=" + skuId + ", " : "")
				+ (additionalProperties != null
						? "additionalProperties=" + toString(additionalProperties.entrySet(), maxLen)
						: "")
				+ "]";
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}

}
