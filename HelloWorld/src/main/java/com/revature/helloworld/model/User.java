package com.revature.helloworld.model;

public class User {
	private String username;
	private String password;
	private int ssn;
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", ssn=" + ssn + "]";
	}
	public User(String username, String password, int ssn) {
		super();
		this.username = username;
		this.password = password;
		this.ssn = ssn;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	
}
