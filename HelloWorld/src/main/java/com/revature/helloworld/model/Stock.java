package com.revature.helloworld.model;

public class Stock {
	private int stockId;
	private String email;
	private int numShares;
	private String companyId;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(int stockId, String email, int numShares, String companyId) {
		super();
		this.stockId = stockId;
		this.email = email;
		this.numShares = numShares;
		this.companyId = companyId;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumShares() {
		return numShares;
	}
	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyname) {
		this.companyId = companyname;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", email=" + email + ", numShares=" + numShares + ", companyId="
				+ companyId + "]";
	}
	
	
}
