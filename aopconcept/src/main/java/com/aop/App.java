package com.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
    	PaymentService paymentObject = context.getBean("payment",PaymentService.class);
    	paymentObject.makePayment(5000);
    }
}
