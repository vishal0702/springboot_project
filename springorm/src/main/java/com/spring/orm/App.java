package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//		Student student = new Student(123, "Vishal Srivastava", "Ayodhya");
//		int r = studentDao.insert(student);
//		System.out.println("Done: " + r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 to add new student");
			System.out.println("PRESS 2 to display all students");
			System.out.println("PRESS 3 to get the detail of single student");
			System.out.println("PRESS 4 to detelet students");
			System.out.println("PRESS 5 to update student");
			System.out.println("PRESS 6 to exit");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// Add new student
					// taking input from user
					System.out.println("Enter Student ID: ");
					int sId = Integer.parseInt(br.readLine());

					System.out.println("Enter Student Name: ");
					String sName = br.readLine();

					System.out.println("Enter Student City: ");
					String sCity = br.readLine();

					// creating student object & setting values
					Student s = new Student();
					s.setStudentId(sId);
					s.setStudentName(sName);
					s.setStudentCity(sCity);

					// Saving/inserting student data
					int r = studentDao.insert(s);
					System.out.println("Student having ID " + r + "is added");
					System.out.println("****************************************");
					System.out.println();
					break;

				case 2:
					// display all students

					List<Student> allStudents = studentDao.getAllStudents();
					System.out.println("****************************************");
					for (Student stud : allStudents) {

						System.out.println("Student ID: " + stud.getStudentId());
						System.out.println("Student Name: " + stud.getStudentName());
						System.out.println("Student City: " + stud.getStudentCity());
						System.out.println("______________________________________");

					}
					System.out.println("****************************************");
					break;
				case 3:
					// get detail of single student
					System.out.println("Enter Student ID to view details: ");
					int studId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(studId);

					System.out.println("Student ID: " + student.getStudentId());
					System.out.println("Student Name: " + student.getStudentName());
					System.out.println("Student City: " + student.getStudentCity());
					System.out.println("****************************************");
					break;
				case 4:
					// delete student
					System.out.println("Enter Student ID to delete: ");
					int studDel = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(studDel);
					System.out.println("Student with ID "+studDel+" is deleted");
					break;
				case 5:
					// update student
					System.out.println("Enter Student ID to update the data: ");
					int sIdUp = Integer.parseInt(br.readLine());

					System.out.println("Enter updated Student Name: ");
					String sNameUp = br.readLine();

					System.out.println("Enter updated Student City: ");
					String sCityUp = br.readLine();

					// creating student object & setting values
					Student sUpdate = new Student();
					sUpdate.setStudentId(sIdUp);
					sUpdate.setStudentName(sNameUp);
					sUpdate.setStudentCity(sCityUp);
					studentDao.updateStudent(sUpdate);
					
					System.out.println("Below Student's data is updated successfully");
					System.out.println("Student ID: " + sUpdate.getStudentId());
					System.out.println("Student Name: " + sUpdate.getStudentName());
					System.out.println("Student City: " + sUpdate.getStudentCity());
					System.out.println("****************************************");
					break;
				case 6:
					// exit
					go = false;
					break;

				}
			} catch (Exception e) {
				System.out.println("Invalid input, try with other options");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thank You! Have a great day");

	}
}
