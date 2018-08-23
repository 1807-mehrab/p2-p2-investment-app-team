package com.revature.helloworld.model;

public class Company {
	private int companyId;
	private String companyName;
	private double companyValue;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int companyId, String companyName, double companyValue) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyValue = companyValue;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getCompanyValue() {
		return companyValue;
	}
	public void setCompanyValue(double companyValue) {
		this.companyValue = companyValue;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyValue=" + companyValue
				+ "]";
	}
	
}
