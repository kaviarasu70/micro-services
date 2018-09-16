package com.kavi.micro.gridwall.gridwall.model;

public class ProductDetails {

    String productId;
    String skuID;
    String imageUrl;


    public ProductDetails() {
    }


    public ProductDetails(String productId, String skuID, String imageUrl) {
        this.productId = productId;
        this.skuID = skuID;
        this.imageUrl = imageUrl;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuID() {
        return skuID;
    }

    public void setSkuID(String skuID) {
        this.skuID = skuID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ProductDetailsClinet{" +
                "productId='" + productId + '\'' +
                ", skuID='" + skuID + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
