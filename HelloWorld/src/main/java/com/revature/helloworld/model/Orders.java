package com.revature.helloworld.model;

public class Orders {
	private int orderId;
	private int orderCode;
	private int stopPrice;
	private int presValue;
	private int presValue2;
	private int companyBought;
	private int companySold;
	private int numBought;
	private int orderSucceed;
	private int userSsn;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId, int orderCode, int stopPrice, int presValue, int presValue2, int companyBought,
			int companySold, int numBought, int orderSucceed, int userSsn) {
		super();
		this.orderId = orderId;
		this.orderCode = orderCode;
		this.stopPrice = stopPrice;
		this.presValue = presValue;
		this.presValue2 = presValue2;
		this.companyBought = companyBought;
		this.companySold = companySold;
		this.numBought = numBought;
		this.orderSucceed = orderSucceed;
		this.userSsn = userSsn;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}
	public int getStopPrice() {
		return stopPrice;
	}
	public void setStopPrice(int stopPrice) {
		this.stopPrice = stopPrice;
	}
	public int getPresValue() {
		return presValue;
	}
	public void setPresValue(int presValue) {
		this.presValue = presValue;
	}
	public int getPresValue2() {
		return presValue2;
	}
	public void setPresValue2(int presValue2) {
		this.presValue2 = presValue2;
	}
	public int getCompanyBought() {
		return companyBought;
	}
	public void setCompanyBought(int companyBought) {
		this.companyBought = companyBought;
	}
	public int getCompanySold() {
		return companySold;
	}
	public void setCompanySold(int companySold) {
		this.companySold = companySold;
	}
	public int getNumBought() {
		return numBought;
	}
	public void setNumBought(int numBought) {
		this.numBought = numBought;
	}
	public int getOrderSucceed() {
		return orderSucceed;
	}
	public void setOrderSucceed(int orderSucceed) {
		this.orderSucceed = orderSucceed;
	}
	public int getUserSsn() {
		return userSsn;
	}
	public void setUserSsn(int userSsn) {
		this.userSsn = userSsn;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderCode=" + orderCode + ", stopPrice=" + stopPrice + ", presValue="
				+ presValue + ", presValue2=" + presValue2 + ", companyBought=" + companyBought + ", companySold="
				+ companySold + ", numBought=" + numBought + ", orderSucceed=" + orderSucceed + ", userSsn=" + userSsn
				+ "]";
	}
	
}
