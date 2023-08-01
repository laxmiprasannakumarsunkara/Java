package com.sathya.javabased.Example2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Emp e1 =context.getBean("e",Emp.class);
        e1.EmpInfo();
        System.out.println(e1);
        context.close();
    }
}
