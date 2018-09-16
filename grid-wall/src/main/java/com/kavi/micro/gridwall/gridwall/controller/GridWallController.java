package com.kavi.micro.gridwall.gridwall.controller;

import com.kavi.micro.gridwall.gridwall.clinet.ProductDetailsClinet;
import com.kavi.micro.gridwall.gridwall.model.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GridWallController {
    @Autowired
    ProductDetailsClinet productDetailsClinet;

    @RequestMapping("/")
    public List<ProductDetails> getProductDetailsList() {
        System.out.println(productDetailsClinet.getproductDetailsList());
        return productDetailsClinet.getproductDetailsList();
    }

    @RequestMapping("/productdetails/{productId}")
    public ProductDetails getProductDetals(@PathVariable("productId") String productId) {
        System.out.println(productDetailsClinet.getProductDetails(productId));
        return productDetailsClinet.getProductDetails(productId);
    }

}
