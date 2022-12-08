package com.customerservice.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
	
	@Autowired
	private RestTemplate restTemplate;

	
	@Autowired
	private CircuitBreakerFactory circuitBreakerFactory;
	
//	@Autowired
//	private WebClient webClient;
	
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

	@Override						//10001
	public String getProductDetails(int productId) {
		// RestTemplate code consumer service is going to talk to product service
		// get the product details
		CircuitBreaker cb = circuitBreakerFactory.create("customerproductcomm");
		String  pro = cb.run(()->restTemplate.getForObject("http://PRODUCT-SERVICE/products/product/"+productId, String.class), exception -> fallback(exception));
		return pro;
	}
	public String fallback(Throwable t) {
		System.out.println(t.getLocalizedMessage());
		return "Product is not available try after sometime: "+t.getLocalizedMessage();
		
	}
//	@Override						//10001
//	public Product getProductDetails(int productId) {
//		// RestTemplate code consumer service is going to talk to product service
//		// get the product details
//		Product p = webClient.get()
//		.uri("http://PRODUCT-SERVICE:9006/product/"+productId)
//		.retrieve()
//		.bodyToMono(Product.class)
//		.block();
//		return p;
//	}
//	
}
