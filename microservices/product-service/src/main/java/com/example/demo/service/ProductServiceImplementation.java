package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProductRepository;
import com.example.demo.entity.Product;
@Service
public class ProductServiceImplementation implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductByID(int productId) {
		// TODO Auto-generated method stub
	
		return productRepository.findById(productId);
	}

	@Override
	public Optional<Product> deleteProductById(int productID) {
		// TODO Auto-generated method stub
		return null;
	}

}
