package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}
	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
	}
	@GetMapping("/user")
	public User getUser() {
		return new User(100,"Rajesh","9894851315");
	}

}
