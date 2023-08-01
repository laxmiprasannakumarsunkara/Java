package com.sathya.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	Product product = context.getBean("product",Product.class);
    	System.out.println(product.getProductId()+","+product.getProductName()+","+product.getProductCost());
    	Customer customer = context.getBean("customer",Customer.class);
    	System.out.println(customer);
    }
    
}
