package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

import io.swagger.annotations.Api;
@RestController
@Api(value = "This is the api get a product details")

public class ProductController{
	@Autowired
	private ProductService ps;
	
	@PostMapping("/products/product")
	
	public Product createProduct(@RequestBody Product p) {
		return ps.createProduct(p);
		
	}
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return ps.getAllProduct();
	}
	//         /product/"+productIdss
	@GetMapping("/products/product/{pid}")
	public Product getProductById(@PathVariable("pid") int pId) {
		System.out.println("product url /product/"+pId);
		
		return ps.getProductByID(pId).get();
	}
}