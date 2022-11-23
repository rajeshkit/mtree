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
			Train train=ac.getBean("t1",Train.class);//223344
			System.out.println(train.getTrainNumber());//0
			System.out.println(train.getTrainName());//null
			System.out.println(train.getSource());//null
			System.out.println(train.getDestination());//null
			System.out.println("******************");
			Passenger p=ac.getBean(Passenger.class);
			System.out.println(p.getPassengerId());
			System.out.println(p.getPassengerName());
			p.getTrainSchedule();
//			
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
