package com.sathya.may8th;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NonVegConfig {
	@Bean
	public NonVegetarian nonvegetarian() {
		return new NonVegetarian();
	}

}
