package com.jpa.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Construction implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="regno")
	private int companyRegistration;
	@Column(name = "name")
	private String companyName;
	@Column(name="email")
	private String companyEmail;
	@Column(name="profit")
	private long companyProfit;
	@Column(name="addrees")
	private String companyAddrees;
	public Construction() {
		// TODO Auto-generated constructor stub
	}

	

	public Construction(String companyName, String companyEmail, long companyProfit, String companyAddrees) {
		super();
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyProfit = companyProfit;
		this.companyAddrees = companyAddrees;
	}



	public int getCompanyRegistration() {
		return companyRegistration;
	}

	public void setCompanyRegistration(int companyRegistration) {
		this.companyRegistration = companyRegistration;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public long getCompanyProfit() {
		return companyProfit;
	}

	public void setCompanyProfit(long companyProfit) {
		this.companyProfit = companyProfit;
	}

	public String getCompanyAddrees() {
		return companyAddrees;
	}

	public void setCompanyAddrees(String companyAddrees) {
		this.companyAddrees = companyAddrees;
	}



}
