package com.customerservice.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.customerservice.entity.Customer;
import com.customerservice.entity.Product;
import com.customerservice.repository.CustomerRepository;
@Service
public class CustomerServiceImplementation implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient webClient;
	
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		
		return customerRepository.findById(id).get();
	}

	@Override
	public Optional<Customer> deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override						//10001
//	public Product getProductDetails(int productId) {
//		// RestTemplate code consumer service is going to talk to product service
//		// get the product details
//		Product p = restTemplate.getForObject("http://localhost:9002/product/"+productId, Product.class);
//		return p;
//	}
	@Override						//10001
	public Product getProductDetails(int productId) {
		// RestTemplate code consumer service is going to talk to product service
		// get the product details
		Product p = webClient.get()
		.uri("http://localhost:9002/product/"+productId)
		.retrieve()
		.bodyToMono(Product.class)
		.block();
		return p;
	}
	
}
