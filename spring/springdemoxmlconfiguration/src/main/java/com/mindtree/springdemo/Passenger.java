package com.mindtree.springdemo;

import java.io.Serializable;

public class Passenger implements Serializable {
	private int passengerId;
	private String passengerName;
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
	
}
