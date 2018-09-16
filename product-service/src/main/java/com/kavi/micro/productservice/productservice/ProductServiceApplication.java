package com.kavi.micro.productservice.productservice;

import com.kavi.micro.productservice.productservice.model.ProductDetails;
import com.kavi.micro.productservice.productservice.repository.ProductDetailsRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    ProductDetailsRepo repositry() {
        ProductDetailsRepo productRepo = new ProductDetailsRepo();
        for (int i = 0; i < 100; i++)
            productRepo.addProduct(new ProductDetails("productId" + i, "skudID" + i, "imageURl" + i));
        return productRepo;
    }
}


