package com.demo.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration //container will auto-detect this annotation and it creates a bean for the 
			   // JavaBeanconfig
@ComponentScans(value = { 
		@ComponentScan("com.mindtree.importantdemo"),
		@ComponentScan("com.demo.controller"),
		@ComponentScan("com.demo.service"),
		@ComponentScan("com.demo.repository") })
public class JavaBeanConfig {
	
}
