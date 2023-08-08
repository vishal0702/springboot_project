package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa=new Samosa();
		return samosa;
	}
	@Bean
	public Student getStudent() {
		Student student = new Student(getSamosa());
		return student;
	}

}
