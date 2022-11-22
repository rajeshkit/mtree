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
			String[] str = ac.getBeanDefinitionNames();
			for (String string : str) {
				System.out.println(string);
				System.out.println(ac.getType(string));
			}
			// i am creating bean, manage bean object, bean destroy
			// t1,t2,t3 beans
			// who is created this bean - developer(Rajesh)
			// IOC - Inversion of control  
			// container - creating bean, manage bean object, bean destroy 
			// container - all java bean classes , No
			// Bean Configuration file - source for what which java class
			//   object can created inside.
    	}
}
