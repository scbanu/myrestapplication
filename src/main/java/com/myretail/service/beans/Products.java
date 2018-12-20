
package com.myretail.service.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "showInStockOnly",
    "products",
    "facets",
    "categoryTitle",
    "childCategoriesCount",
    "seoInformation",
    "results",
    "pagesAvailable",
    "crumbs",
    "dynamicBannerId",
    "seoBannerId",
    "redirectUrl",
    "staticLinks",
    "selectedDept",
    "multiCatSelected",
    "endecaCanonical"
})
public class Products {

    @JsonProperty("showInStockOnly")
    private String showInStockOnly;
    @JsonProperty("products")
    private List<Product> products = null;
    @JsonProperty("facets")
    private List<Facet> facets = null;
    @JsonProperty("categoryTitle")
    private String categoryTitle;
    @JsonProperty("childCategoriesCount")
    private Integer childCategoriesCount;
    @JsonProperty("seoInformation")
    private SeoInformation seoInformation;
    @JsonProperty("results")
    private Integer results;
    @JsonProperty("pagesAvailable")
    private Integer pagesAvailable;
    @JsonProperty("crumbs")
    private List<Crumb> crumbs = null;
    @JsonProperty("dynamicBannerId")
    private String dynamicBannerId;
    @JsonProperty("seoBannerId")
    private String seoBannerId;
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @JsonProperty("staticLinks")
    private List<Object> staticLinks = null;
    @JsonProperty("selectedDept")
    private String selectedDept;
    @JsonProperty("multiCatSelected")
    private String multiCatSelected;
    @JsonProperty("endecaCanonical")
    private String endecaCanonical;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("showInStockOnly")
    public String getShowInStockOnly() {
        return showInStockOnly;
    }

    @JsonProperty("showInStockOnly")
    public void setShowInStockOnly(String showInStockOnly) {
        this.showInStockOnly = showInStockOnly;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("facets")
    public List<Facet> getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    @JsonProperty("categoryTitle")
    public String getCategoryTitle() {
        return categoryTitle;
    }

    @JsonProperty("categoryTitle")
    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    @JsonProperty("childCategoriesCount")
    public Integer getChildCategoriesCount() {
        return childCategoriesCount;
    }

    @JsonProperty("childCategoriesCount")
    public void setChildCategoriesCount(Integer childCategoriesCount) {
        this.childCategoriesCount = childCategoriesCount;
    }

    @JsonProperty("seoInformation")
    public SeoInformation getSeoInformation() {
        return seoInformation;
    }

    @JsonProperty("seoInformation")
    public void setSeoInformation(SeoInformation seoInformation) {
        this.seoInformation = seoInformation;
    }

    @JsonProperty("results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Integer results) {
        this.results = results;
    }

    @JsonProperty("pagesAvailable")
    public Integer getPagesAvailable() {
        return pagesAvailable;
    }

    @JsonProperty("pagesAvailable")
    public void setPagesAvailable(Integer pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }

    @JsonProperty("crumbs")
    public List<Crumb> getCrumbs() {
        return crumbs;
    }

    @JsonProperty("crumbs")
    public void setCrumbs(List<Crumb> crumbs) {
        this.crumbs = crumbs;
    }

    @JsonProperty("dynamicBannerId")
    public String getDynamicBannerId() {
        return dynamicBannerId;
    }

    @JsonProperty("dynamicBannerId")
    public void setDynamicBannerId(String dynamicBannerId) {
        this.dynamicBannerId = dynamicBannerId;
    }

    @JsonProperty("seoBannerId")
    public String getSeoBannerId() {
        return seoBannerId;
    }

    @JsonProperty("seoBannerId")
    public void setSeoBannerId(String seoBannerId) {
        this.seoBannerId = seoBannerId;
    }

    @JsonProperty("redirectUrl")
    public String getRedirectUrl() {
        return redirectUrl;
    }

    @JsonProperty("redirectUrl")
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    @JsonProperty("staticLinks")
    public List<Object> getStaticLinks() {
        return staticLinks;
    }

    @JsonProperty("staticLinks")
    public void setStaticLinks(List<Object> staticLinks) {
        this.staticLinks = staticLinks;
    }

    @JsonProperty("selectedDept")
    public String getSelectedDept() {
        return selectedDept;
    }

    @JsonProperty("selectedDept")
    public void setSelectedDept(String selectedDept) {
        this.selectedDept = selectedDept;
    }

    @JsonProperty("multiCatSelected")
    public String getMultiCatSelected() {
        return multiCatSelected;
    }

    @JsonProperty("multiCatSelected")
    public void setMultiCatSelected(String multiCatSelected) {
        this.multiCatSelected = multiCatSelected;
    }

    @JsonProperty("endecaCanonical")
    public String getEndecaCanonical() {
        return endecaCanonical;
    }

    @JsonProperty("endecaCanonical")
    public void setEndecaCanonical(String endecaCanonical) {
        this.endecaCanonical = endecaCanonical;
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
