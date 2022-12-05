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
@RestController
public class ProductController{
	@Autowired
	private ProductService ps;
	
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product p) {
		return ps.createProduct(p);
		
	}
	@GetMapping("/allproducts")
	public List<Product> getAllProducts(){
		return ps.getAllProduct();
	}
	//         /product/"+productIdss
	@GetMapping("/product/{pid}")
	public Product getProductById(@PathVariable("pid") int pId) {
		System.out.println("product url /product/"+pId);
		
		return ps.getProductByID(pId).get();
	}
}