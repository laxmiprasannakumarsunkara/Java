package com.sathya.may8th.Ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({VegConfig.class})
public class NonVegConfig {
	@Bean
	public NonVegetarian nonvegetarian() {
		return new NonVegetarian();
	}

}
