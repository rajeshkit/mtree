package com.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.entity.Customer;
import com.customerservice.entity.Product;
import com.customerservice.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customers/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	@GetMapping("/customers")
	public List<Customer> getAllCustomersCustomer() {
		return customerService.getAllCustomers();
	}
	@GetMapping("/customers/customer/{id}")
	public Customer getCustomerById(@PathVariable("id") int cId) {
		return customerService.getCustomerById(cId);
	}
	//http://localhost:9000/customers/customer/10001
//	@GetMapping("/customer/{productid}")
//	public Product getProductDetails(@PathVariable("productid") int productId) {
//		
//		return customerService.getProductDetails(productId);
//		
//	}
	@GetMapping("/customers/{productid}")
	public String getProductDetails(@PathVariable("productid") int productId) {
		
		return customerService.getProductDetails(productId);
		
	}
	
}
