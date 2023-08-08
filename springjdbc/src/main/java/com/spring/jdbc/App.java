package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program started...");
		// Spring jdbc => JdbcTemplate

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		StudentDAO studentDao = context.getBean("studentDao", StudentDAO.class);

		// Insert

//		Student student = new Student();
//		student.setId(123);
//		student.setName("Chirag");
//		student.setCity("Paris");
//
//		int result = studentDao.insert(student);
//
//		System.out.println("Students added: " + result);

		// Update
		/*
		 * Student student = new Student();
		 * 
		 * student.setId(456); student.setName("Raghav Roy"); student.setCity("Pune");
		 * 
		 * int result = studentDao.change(student); System.out.println("Data Changed: "
		 * + result);
		 */

		// Delete
		/*
		 * int result = studentDao.delete(567); System.out.println("Rows Deleted: " +
		 * result);
		 */

		// Select single row
		/*
		 * Student student = studentDao.getStudent(222); System.out.println(student);
		 */

		// Select multiple rows
		List<Student> studentList = studentDao.getStudentList();
		for (Student s : studentList) {
			System.out.println(s);
		}

	}
}