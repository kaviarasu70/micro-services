package com.kavi.micro.gridwall.gridwall;

import com.kavi.micro.gridwall.gridwall.clinet.ProductDetailsClinet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan
public class GridWallApplication {

	public static void main(String[] args) {
		SpringApplication.run(GridWallApplication.class, args);
	}

//	@Bean
//	public ProductDetailsClinet consumerControllerClient() {
//		return new ProductDetailsClinet();
//	}
}
