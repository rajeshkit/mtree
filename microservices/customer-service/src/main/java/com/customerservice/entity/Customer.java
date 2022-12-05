package com.customerservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private String email;
	private String phone;
}	
