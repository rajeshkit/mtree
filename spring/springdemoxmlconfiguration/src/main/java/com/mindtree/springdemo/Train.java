package com.mindtree.springdemo;

import java.io.Serializable;
import java.util.Date;

public class Train implements Serializable{
	private int trainNumber;
	private String trainName;
	private String source;
	private String destination;
	public Train() {
		// TODO Auto-generated constructor stub
	}
	
	public Train(int tn, String tNa, String s, String d) {
		super();
		this.trainNumber = tn;
		this.trainName = tNa;
		this.source = s;
		this.destination = d;
	}
	
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}
	public String trainSchedule() {
		return new Date().toString();
	}
	
	
}
