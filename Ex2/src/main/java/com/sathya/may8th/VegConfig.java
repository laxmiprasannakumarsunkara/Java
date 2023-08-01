package com.sathya.may8th;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VegConfig {
	@Bean
	public Vegetarian vegetarian() {
		return new Vegetarian();
	}

}
