package com.sathya.javabased;

public class Customer {
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private long customerMobile;
	public Customer(String customerFirstName, String customerLastName, String customerEmail, long customerMobile) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmail = customerEmail;
		this.customerMobile = customerMobile;
	}
	@Override
	public String toString() {
		return "Customer [customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName
				+ ", customerEmail=" + customerEmail + ", customerMobile=" + customerMobile + "]";
	}
	

}
