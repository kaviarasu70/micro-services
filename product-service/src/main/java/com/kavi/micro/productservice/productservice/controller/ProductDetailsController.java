package com.kavi.micro.productservice.productservice.controller;

import com.kavi.micro.productservice.productservice.model.ProductDetails;
import com.kavi.micro.productservice.productservice.repository.ProductDetailsRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductDetailsController {
    @Autowired
    ProductDetailsRepo productDetailsRepo;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductDetails.class);

    @RequestMapping("/getproductdeatils/{productId}")
    public ProductDetails getProduct(@PathVariable("productId") String productId) {
        LOGGER.info("productID get: {}", productId);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + productDetailsRepo.getProductList().size());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>productId>>>>>" + productId);
        return productDetailsRepo.getProduct(productId);
    }

    @RequestMapping("/")
    public List<ProductDetails> getAllProductDetails() {
        return productDetailsRepo.getProductList();
    }

    @RequestMapping("/addproductdetails")
    public ProductDetails addProdcutDetails(@RequestBody() ProductDetails productDetails) {
        LOGGER.info("addProdcutDetails get: {}", productDetails.toString());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>" + productDetails);
        productDetailsRepo.addProduct(productDetails);
        return productDetails;
    }

    @RequestMapping("/removeproductDetails")
    public ProductDetails removeProductDetails(ProductDetails productDetails) {
        productDetailsRepo.removeProduct(productDetails);
        return productDetails;
    }
}
