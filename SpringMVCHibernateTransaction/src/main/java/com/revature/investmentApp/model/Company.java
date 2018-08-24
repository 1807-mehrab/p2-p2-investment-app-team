package com.revature.investmentApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company {
	private int company_id;
	private String company_name;
	private double company_value;
	public Company() {
		
	}
	public Company(int company_id, String company_name, double company_value) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.company_value = company_value;
	}
	
	@Id
	@Column(name = "COMPANY_ID")
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	
	@Column(name = "COMPANY_NAME")
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	@Column(name = "COMPANY_VALUE")
	public double getCompany_value() {
		return company_value;
	}
	public void setCompany_value(double company_value) {
		this.company_value = company_value;
	}
	
	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name=" + company_name + ", company_value="
				+ company_value + "]";
	}
	
	
	
}
