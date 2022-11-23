package com.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.demo.controller.EmployeeController;
import com.demo.service.EmployeeService;
import com.mindtree.importantdemo.Employee;

@Configuration //container will auto-detect this annotation and it creates a bean for the 
			   // JavaBeanconfig
public class JavaBeanConfig {
	@Bean
	public Employee createEmployee() {
		return new Employee();
	}
	@Bean
	public EmployeeController createEmployeeController() {
		return new EmployeeController();
	}
	@Bean
	public EmployeeService createEmployeeService() {
		return new EmployeeService();
	}
}
