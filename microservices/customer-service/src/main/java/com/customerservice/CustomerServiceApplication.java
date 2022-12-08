package com.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@CircuitBreaker(name = "customerproductcomm")
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}
