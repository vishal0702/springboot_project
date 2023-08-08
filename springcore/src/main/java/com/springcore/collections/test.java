package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp1= (Emp) context.getBean("emp1");
		
		System.out.println("Name: "+emp1.getName());
		System.out.println("Contact: "+emp1.getPhones());
		System.out.println("Address: "+emp1.getAddresses());
		System.out.println("Courses: "+emp1.getCourses());
		System.out.println("Properties: "+emp1.getProps());
	}

}
