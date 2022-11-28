package com.abccons.entity;

public class Construction {
	private int companyRegistration;
	private String companyName;
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
