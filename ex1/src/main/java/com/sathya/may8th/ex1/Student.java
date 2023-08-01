package com.sathya.may8th.ex1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("8080")
	int roll;
	public Student() {
		System.out.println("student::constructor");
	}
	
	public void studentInfo() {
		System.out.println("roll number is"+roll);
	}

}
