package com.sathya.may8th;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(VegConfig.class,NonVegConfig.class);
      Vegetarian vegetarian = context.getBean("vegetarian",Vegetarian.class);
      vegetarian.vegInfo();
      NonVegetarian nonVegetarian = context.getBean("nonvegetarian",NonVegetarian.class);
      nonVegetarian.nonVegInfo();
    }
}
