package com.kavi.micro.productservice.productservice.repository;

import com.kavi.micro.productservice.productservice.model.ProductDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDetailsRepo {

    List<ProductDetails> productList = new ArrayList<ProductDetails>();


    public ProductDetails getProduct(String productId) {
        Optional<ProductDetails> productDetails =
                productList.stream().filter(ProductDetails -> ProductDetails.getProductId().equalsIgnoreCase(productId)).findFirst();
        if (productDetails.isPresent())
            return productDetails.get();
        else
            return new ProductDetails();
    }

    public ProductDetails addProduct(ProductDetails productDetails) {
        productList.add(productDetails);
        return productDetails;
    }

    public List<ProductDetails> getProductList() {
        return productList;
    }

    public ProductDetails removeProduct(ProductDetails productDetails) {
        productList.remove(productDetails);
        return productDetails;
    }

}