package com.sathya.assignment1;

public class Customer {
	String CustomerFirstname;
	String CustomerLastname;
	String CustomerEmail;
	long CustomerMobile;
	public Customer(String customerFirstname, String customerLastname, String customerEmail, long customerMobile) {
		super();
		CustomerFirstname = customerFirstname;
		CustomerLastname = customerLastname;
		CustomerEmail = customerEmail;
		CustomerMobile = customerMobile;
	}
	@Override
	public String toString() {
		return "Customer [CustomerFirstname=" + CustomerFirstname + ", CustomerLastname=" + CustomerLastname
				+ ", CustomerEmail=" + CustomerEmail + ", CustomerMobile=" + CustomerMobile + "]";
	}
	

}
