package com.sathya.javabased.Example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	

	@Bean(name= {"e"},initMethod = "init",destroyMethod = "destroy")
	@Scope( "singleton")
	public Emp emp() {
		return new Emp();
	}
	

}
