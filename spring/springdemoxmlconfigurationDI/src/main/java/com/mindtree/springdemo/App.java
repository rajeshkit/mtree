package com.mindtree.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    	public static void main(String[] args) {
    		BeanFactory b;
    		ApplicationContext ac=null;
    		ac=new ClassPathXmlApplicationContext("springbeanconfiguration.xml");
			String[] names = ac.getBeanDefinitionNames();	
			for (String string : names) {
				System.out.println(string);
			}

    	}
}
