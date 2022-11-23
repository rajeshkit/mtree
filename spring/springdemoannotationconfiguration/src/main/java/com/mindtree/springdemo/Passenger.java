package com.mindtree.springdemo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Passenger implements Serializable {
	private int passengerId;
	private String passengerName;
	private Train train; // byName
	
	@Autowired  //byType
	public void setTrain(Train train) {
		this.train = train;
	}
	@Autowired // constructor
	public Passenger(Train train) {
		super();
		this.train = train;
		
	}
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	void dispplay() {
		System.out.println(train.schedule());
	}
}
