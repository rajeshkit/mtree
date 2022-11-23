package com.mindtree.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Passenger  {
	Train train;
	
	public Passenger(Train train) {
		this.train = train;
	}

	public void  passengerGetTrainSchedule() {
		train.trainSchedule();
		
	}
	public static void main(String[] args) {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("springbeanconfiguration.xml");
		Passenger s=ac.getBean(Passenger.class);
		s.passengerGetTrainSchedule();
		
	}
}
