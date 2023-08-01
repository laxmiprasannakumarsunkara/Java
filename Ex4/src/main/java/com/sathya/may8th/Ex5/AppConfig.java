package com.sathya.may8th.Ex5;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public Book book() {
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("Game Of Thrones");
		book.setBookAuthor("Jorge RR Martin");
		return book;
	}
	@Bean
	public Customer customer() {
		Customer customer = new Customer();
		customer.setCustomerFirstName("Prasanna Kumar");
		customer.setCustomerMailId("prasannakumar@gmail.com");
		customer.setCustomerMobile(7032528245L);
		return customer;
	}

}
