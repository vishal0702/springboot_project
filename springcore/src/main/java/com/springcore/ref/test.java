package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A temp=(A) context.getBean("aref");
		
		System.out.println("x: "+temp.getX());
		System.out.println("y: "+temp.getOb().getY());

	}

}