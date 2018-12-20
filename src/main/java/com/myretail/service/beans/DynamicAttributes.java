
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
    "newinproducttype",
    "washinginstructions",
    "dressbyoccasion",
    "dressshape",
    "typeofpattern"
})
public class DynamicAttributes {

    @JsonProperty("newinproducttype")
    private String newinproducttype;
    @JsonProperty("washinginstructions")
    private String washinginstructions;
    @JsonProperty("dressbyoccasion")
    private String dressbyoccasion;
    @JsonProperty("dressshape")
    private String dressshape;
    @JsonProperty("typeofpattern")
    private String typeofpattern;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("newinproducttype")
    public String getNewinproducttype() {
        return newinproducttype;
    }

    @JsonProperty("newinproducttype")
    public void setNewinproducttype(String newinproducttype) {
        this.newinproducttype = newinproducttype;
    }

    @JsonProperty("washinginstructions")
    public String getWashinginstructions() {
        return washinginstructions;
    }

    @JsonProperty("washinginstructions")
    public void setWashinginstructions(String washinginstructions) {
        this.washinginstructions = washinginstructions;
    }

    @JsonProperty("dressbyoccasion")
    public String getDressbyoccasion() {
        return dressbyoccasion;
    }

    @JsonProperty("dressbyoccasion")
    public void setDressbyoccasion(String dressbyoccasion) {
        this.dressbyoccasion = dressbyoccasion;
    }

    @JsonProperty("dressshape")
    public String getDressshape() {
        return dressshape;
    }

    @JsonProperty("dressshape")
    public void setDressshape(String dressshape) {
        this.dressshape = dressshape;
    }

    @JsonProperty("typeofpattern")
    public String getTypeofpattern() {
        return typeofpattern;
    }

    @JsonProperty("typeofpattern")
    public void setTypeofpattern(String typeofpattern) {
        this.typeofpattern = typeofpattern;
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
