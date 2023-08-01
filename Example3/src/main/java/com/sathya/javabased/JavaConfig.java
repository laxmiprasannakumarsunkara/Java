package com.sathya.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
	@Bean
	public Product product() {
		Product product = new Product();
		product.setProductId(1);
		product.setProductName("MOBILE");
		product.setProductCost(30000.45);
		return product;
		
		
	}

	@Bean
	public Customer customer() {
		return new Customer("Prasanna", "Kumar", "prassu2125@gmail.com", 7032528245L);
	}
	
	
	
	

	

}
