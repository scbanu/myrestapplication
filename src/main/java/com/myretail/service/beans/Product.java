
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
    "productId",
    "type",
    "title",
    "code",
    "averageRating",
    "reviews",
    "price",
    "image",
    "additionalServices",
    "displaySpecialOffer",
    "promoMessages",
    "nonPromoMessage",
    "defaultSkuId",
    "ColorSwatches",
    "colorSwatchSelected",
    "colorWheelMessage",
    "outOfStock",
    "emailMeWhenAvailable",
    "availabilityMessage",
    "compare",
    "fabric",
    "swatchAvailable",
    "categoryQuickViewEnabled",
    "swatchCategoryType",
    "brand",
    "ageRestriction",
    "isInStoreOnly",
    "isMadeToMeasure",
    "isBundle",
    "isProductSet",
    "promotionalFeatures",
    "features",
    "dynamicAttributes",
    "directorate",
    "releaseDateTimestamp"
})
public class Product {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("code")
    private String code;
    @JsonProperty("averageRating")
    private Double averageRating;
    @JsonProperty("reviews")
    private Integer reviews;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("image")
    private String image;
    @JsonProperty("additionalServices")
    private List<Object> additionalServices = null;
    @JsonProperty("displaySpecialOffer")
    private String displaySpecialOffer;
    @JsonProperty("promoMessages")
    private PromoMessages promoMessages;
    @JsonProperty("nonPromoMessage")
    private String nonPromoMessage;
    @JsonProperty("defaultSkuId")
    private String defaultSkuId;
    @JsonProperty("ColorSwatches")
    private List<ColorSwatch> colorSwatches = null;
    @JsonProperty("colorSwatchSelected")
    private Integer colorSwatchSelected;
    @JsonProperty("colorWheelMessage")
    private String colorWheelMessage;
    @JsonProperty("outOfStock")
    private Boolean outOfStock;
    @JsonProperty("emailMeWhenAvailable")
    private Boolean emailMeWhenAvailable;
    @JsonProperty("availabilityMessage")
    private String availabilityMessage;
    @JsonProperty("compare")
    private Boolean compare;
    @JsonProperty("fabric")
    private String fabric;
    @JsonProperty("swatchAvailable")
    private Boolean swatchAvailable;
    @JsonProperty("categoryQuickViewEnabled")
    private Boolean categoryQuickViewEnabled;
    @JsonProperty("swatchCategoryType")
    private String swatchCategoryType;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("ageRestriction")
    private Integer ageRestriction;
    @JsonProperty("isInStoreOnly")
    private Boolean isInStoreOnly;
    @JsonProperty("isMadeToMeasure")
    private Boolean isMadeToMeasure;
    @JsonProperty("isBundle")
    private Boolean isBundle;
    @JsonProperty("isProductSet")
    private Boolean isProductSet;
    @JsonProperty("promotionalFeatures")
    private List<Object> promotionalFeatures = null;
    @JsonProperty("features")
    private List<Object> features = null;
    @JsonProperty("dynamicAttributes")
    private DynamicAttributes dynamicAttributes;
    @JsonProperty("directorate")
    private String directorate;
    @JsonProperty("releaseDateTimestamp")
    private Integer releaseDateTimestamp;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("averageRating")
    public Double getAverageRating() {
        return averageRating;
    }

    @JsonProperty("averageRating")
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    @JsonProperty("reviews")
    public Integer getReviews() {
        return reviews;
    }

    @JsonProperty("reviews")
    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("additionalServices")
    public List<Object> getAdditionalServices() {
        return additionalServices;
    }

    @JsonProperty("additionalServices")
    public void setAdditionalServices(List<Object> additionalServices) {
        this.additionalServices = additionalServices;
    }

    @JsonProperty("displaySpecialOffer")
    public String getDisplaySpecialOffer() {
        return displaySpecialOffer;
    }

    @JsonProperty("displaySpecialOffer")
    public void setDisplaySpecialOffer(String displaySpecialOffer) {
        this.displaySpecialOffer = displaySpecialOffer;
    }

    @JsonProperty("promoMessages")
    public PromoMessages getPromoMessages() {
        return promoMessages;
    }

    @JsonProperty("promoMessages")
    public void setPromoMessages(PromoMessages promoMessages) {
        this.promoMessages = promoMessages;
    }

    @JsonProperty("nonPromoMessage")
    public String getNonPromoMessage() {
        return nonPromoMessage;
    }

    @JsonProperty("nonPromoMessage")
    public void setNonPromoMessage(String nonPromoMessage) {
        this.nonPromoMessage = nonPromoMessage;
    }

    @JsonProperty("defaultSkuId")
    public String getDefaultSkuId() {
        return defaultSkuId;
    }

    @JsonProperty("defaultSkuId")
    public void setDefaultSkuId(String defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
    }

    @JsonProperty("ColorSwatches")
    public List<ColorSwatch> getColorSwatches() {
        return colorSwatches;
    }

    @JsonProperty("ColorSwatches")
    public void setColorSwatches(List<ColorSwatch> colorSwatches) {
        this.colorSwatches = colorSwatches;
    }

    @JsonProperty("colorSwatchSelected")
    public Integer getColorSwatchSelected() {
        return colorSwatchSelected;
    }

    @JsonProperty("colorSwatchSelected")
    public void setColorSwatchSelected(Integer colorSwatchSelected) {
        this.colorSwatchSelected = colorSwatchSelected;
    }

    @JsonProperty("colorWheelMessage")
    public String getColorWheelMessage() {
        return colorWheelMessage;
    }

    @JsonProperty("colorWheelMessage")
    public void setColorWheelMessage(String colorWheelMessage) {
        this.colorWheelMessage = colorWheelMessage;
    }

    @JsonProperty("outOfStock")
    public Boolean getOutOfStock() {
        return outOfStock;
    }

    @JsonProperty("outOfStock")
    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    @JsonProperty("emailMeWhenAvailable")
    public Boolean getEmailMeWhenAvailable() {
        return emailMeWhenAvailable;
    }

    @JsonProperty("emailMeWhenAvailable")
    public void setEmailMeWhenAvailable(Boolean emailMeWhenAvailable) {
        this.emailMeWhenAvailable = emailMeWhenAvailable;
    }

    @JsonProperty("availabilityMessage")
    public String getAvailabilityMessage() {
        return availabilityMessage;
    }

    @JsonProperty("availabilityMessage")
    public void setAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
    }

    @JsonProperty("compare")
    public Boolean getCompare() {
        return compare;
    }

    @JsonProperty("compare")
    public void setCompare(Boolean compare) {
        this.compare = compare;
    }

    @JsonProperty("fabric")
    public String getFabric() {
        return fabric;
    }

    @JsonProperty("fabric")
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @JsonProperty("swatchAvailable")
    public Boolean getSwatchAvailable() {
        return swatchAvailable;
    }

    @JsonProperty("swatchAvailable")
    public void setSwatchAvailable(Boolean swatchAvailable) {
        this.swatchAvailable = swatchAvailable;
    }

    @JsonProperty("categoryQuickViewEnabled")
    public Boolean getCategoryQuickViewEnabled() {
        return categoryQuickViewEnabled;
    }

    @JsonProperty("categoryQuickViewEnabled")
    public void setCategoryQuickViewEnabled(Boolean categoryQuickViewEnabled) {
        this.categoryQuickViewEnabled = categoryQuickViewEnabled;
    }

    @JsonProperty("swatchCategoryType")
    public String getSwatchCategoryType() {
        return swatchCategoryType;
    }

    @JsonProperty("swatchCategoryType")
    public void setSwatchCategoryType(String swatchCategoryType) {
        this.swatchCategoryType = swatchCategoryType;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("ageRestriction")
    public Integer getAgeRestriction() {
        return ageRestriction;
    }

    @JsonProperty("ageRestriction")
    public void setAgeRestriction(Integer ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @JsonProperty("isInStoreOnly")
    public Boolean getIsInStoreOnly() {
        return isInStoreOnly;
    }

    @JsonProperty("isInStoreOnly")
    public void setIsInStoreOnly(Boolean isInStoreOnly) {
        this.isInStoreOnly = isInStoreOnly;
    }

    @JsonProperty("isMadeToMeasure")
    public Boolean getIsMadeToMeasure() {
        return isMadeToMeasure;
    }

    @JsonProperty("isMadeToMeasure")
    public void setIsMadeToMeasure(Boolean isMadeToMeasure) {
        this.isMadeToMeasure = isMadeToMeasure;
    }

    @JsonProperty("isBundle")
    public Boolean getIsBundle() {
        return isBundle;
    }

    @JsonProperty("isBundle")
    public void setIsBundle(Boolean isBundle) {
        this.isBundle = isBundle;
    }

    @JsonProperty("isProductSet")
    public Boolean getIsProductSet() {
        return isProductSet;
    }

    @JsonProperty("isProductSet")
    public void setIsProductSet(Boolean isProductSet) {
        this.isProductSet = isProductSet;
    }

    @JsonProperty("promotionalFeatures")
    public List<Object> getPromotionalFeatures() {
        return promotionalFeatures;
    }

    @JsonProperty("promotionalFeatures")
    public void setPromotionalFeatures(List<Object> promotionalFeatures) {
        this.promotionalFeatures = promotionalFeatures;
    }

    @JsonProperty("features")
    public List<Object> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    @JsonProperty("dynamicAttributes")
    public DynamicAttributes getDynamicAttributes() {
        return dynamicAttributes;
    }

    @JsonProperty("dynamicAttributes")
    public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }

    @JsonProperty("directorate")
    public String getDirectorate() {
        return directorate;
    }

    @JsonProperty("directorate")
    public void setDirectorate(String directorate) {
        this.directorate = directorate;
    }

    @JsonProperty("releaseDateTimestamp")
    public Integer getReleaseDateTimestamp() {
        return releaseDateTimestamp;
    }

    @JsonProperty("releaseDateTimestamp")
    public void setReleaseDateTimestamp(Integer releaseDateTimestamp) {
        this.releaseDateTimestamp = releaseDateTimestamp;
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
