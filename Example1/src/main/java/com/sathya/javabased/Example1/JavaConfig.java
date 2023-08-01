package com.sathya.javabased.Example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Food food() {
		return new Food();
	}
	@Bean(name = {"fr"})
	public Fruit fruit() {
		return new Fruit();
	}

}
