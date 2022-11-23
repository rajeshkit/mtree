package com.mindtree.importantdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.config.JavaBeanConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=
        		new AnnotationConfigApplicationContext(JavaBeanConfig.class);
        String[] names=ac.getBeanDefinitionNames();
        for (String string : names) {
			System.out.println(string+" "+ac.getType(string));
		}
      
    }
}
