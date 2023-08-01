package com.sathya.may8th.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      Student student = context.getBean("student",Student.class);
      student.studentInfo();
    }

	

}

