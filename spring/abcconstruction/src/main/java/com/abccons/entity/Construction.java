package com.abccons.entity;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;


public class Construction implements Serializable{
	@Min(value = 1000, message = "Company registraion no greater than 1000")
	@Max(value = 2000, message = "Company registraion no less than 1000")
	@PositiveOrZero(message = "Company registration number should not be in negative")
	private int companyRegistration; //0
	@NotBlank(message="Comapny name cannot be null")
	@Pattern(regexp = "^[a-zA-Z]+$",message="Company name should not contain any special characters")
	private String companyName;
	@Email(message = "Invalid Email")
	private String companyEmail;
	private long companyProfit;
	public Construction() {
		// TODO Auto-generated constructor stub
	}
	public Construction(int companyRegistration, String companyName, String companyEmail, long companyProfit) {
		super();
		this.companyRegistration = companyRegistration;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyProfit = companyProfit;
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
	
}
