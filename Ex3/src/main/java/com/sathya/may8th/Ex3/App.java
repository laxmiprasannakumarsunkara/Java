package com.sathya.may8th.Ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(NonVegConfig.class);
    	 NonVegetarian nonVegetarian = context.getBean("nonvegetarian",NonVegetarian.class);
    	 nonVegetarian.nonVegInfo();
    	 Vegetarian vegetarian = context.getBean("vegetarian",Vegetarian.class);
    	 vegetarian.vegInfo();
    }
}
