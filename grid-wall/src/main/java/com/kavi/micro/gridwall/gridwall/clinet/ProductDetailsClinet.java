package com.kavi.micro.gridwall.gridwall.clinet;

import com.kavi.micro.gridwall.gridwall.model.ProductDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "productdetails-service")
public interface ProductDetailsClinet {

    @RequestMapping("/")
    public List<ProductDetails> getproductDetailsList();

    @RequestMapping("/getproductdeatils/{productId}")
    public ProductDetails getProductDetails(@PathVariable("productId") String productId);
}
