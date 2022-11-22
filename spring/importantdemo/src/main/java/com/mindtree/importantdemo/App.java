package com.mindtree.importantdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("springbeanconfiguration.xml");
        String[] beans = ac.getBeanDefinitionNames();
        for (String bean : beans) {
			System.out.println(bean+" "+ac.getType(bean));
		}
    }
}
