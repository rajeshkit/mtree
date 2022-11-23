package com.mindtree.springdemo;

import java.io.Serializable;

public class Passenger implements Serializable {
	private int passengerId;
	private String passengerName;
	private Train t;
	
	public Passenger(Train t) {
		super();
		this.t = t;
	}
	
	public void setT(Train t) {
		this.t = t;
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
	public void getTrainSchedule() {
		t.trainSchedule();
	}
}
