package com.sathya.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-info.xml");
    	Student student = context.getBean("student", Student.class);
    	System.out.println("Student Roll no-"+student.getStudentRoll()+","+"Student Name-"+student.getStudentName());
    	System.out.println("***************************************************************************************");
    	
    	
    }
}
