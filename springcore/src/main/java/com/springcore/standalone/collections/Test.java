package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/saloneconfig.xml");
		Person person1=(Person) context.getBean("person1");
		System.out.println(person1.getFriends() );
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("______________________________________________");
		System.out.println(person1.getFeeStructure());
		
		System.out.println("______________________________________________");
		System.out.println(person1.getProperties());
	}

}
