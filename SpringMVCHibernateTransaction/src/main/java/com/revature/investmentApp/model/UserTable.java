package com.revature.investmentApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERTABLE")
public class UserTable {
	private String email;
	private String password;
	private int ssn;
	public UserTable() {
		
	}
	public UserTable(String email, String password, int ssn) {
		super();
		this.email = email;
		this.password = password;
		this.ssn = ssn;
	}
	@Id
	@Column(name = "USER_EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "USER_PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "USER_SSN")
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "UserTable [email=" + email + ", password=" + password + ", ssn=" + ssn + "]";
	}
	
	
	
	
}
