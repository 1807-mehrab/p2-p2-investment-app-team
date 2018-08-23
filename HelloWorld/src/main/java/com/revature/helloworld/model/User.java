package com.revature.helloworld.model;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@Table(appliesTo = "USERTABLE")
@JsonRootName(value = "User")
public class User {
	@Id
	@Column(name="user_email")
	private String username;
	
	@Id
	@Column(name="user_password")
	private String password;
	
	@Id
	@Column(name="user_ssn")
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
