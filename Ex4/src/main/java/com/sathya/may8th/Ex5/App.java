package com.sathya.may8th.Ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(CollectionData.class);
    	CollectionData collectionData = context.getBean("collectionData",CollectionData.class);
    	collectionData.getBooks().forEach(books->System.out.println(books.getBookId()+","+books.getBookName()+","+books.getBookAuthor()));
    	collectionData.getCustomer().forEach(customer->System.out.println(customer.getCustomerFirstName()+","+customer.getCustomerMailId()+","+customer.getCustomerMobile()));
    }
}
