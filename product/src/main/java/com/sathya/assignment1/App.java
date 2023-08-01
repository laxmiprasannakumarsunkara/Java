package com.sathya.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-info.xml");
        Customer c = context.getBean("customer", Customer.class);
        System.out.println(c);
        Product p = context.getBean("product",Product.class );
        System.out.println("Product id is:"+p.getProductId()+","+"Product name is:"+p.getProductName()+","+"Product cost is:"+p.getProductCost()+","+"Product quality is:"+p.getProductQuantity());
        p.bill();
        
        
  
    }
}
