package com.sathya.javabased.Example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context =   new AnnotationConfigApplicationContext(JavaConfig.class);
     Food food = context.getBean("food",Food.class);
     food.foodInfo();
     Fruit fruit = context.getBean("fr",Fruit.class);
     fruit.fruitInfo();
    }
}
