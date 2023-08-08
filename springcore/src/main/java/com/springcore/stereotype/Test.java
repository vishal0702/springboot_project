package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student s1=(Student) context.getBean("student");
		System.out.println(s1.hashCode());
		
		Student s2=(Student) context.getBean("student");
		System.out.println(s2.hashCode());
		
		Teacher t1=(Teacher) context.getBean("teacher");
		System.out.println(t1.hashCode());
		Teacher t2=(Teacher) context.getBean("teacher");
		System.out.println(t2.hashCode());
		/*
		 * System.out.println(s1); System.out.println(s1.getAddress());
		 */
	}
}
