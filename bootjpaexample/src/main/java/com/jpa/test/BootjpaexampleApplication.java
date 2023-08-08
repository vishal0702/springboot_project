package com.jpa.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
//@EntityScan(basePackages = {"com.jpa.test.entities.User"})
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("Vishal Srivastava");
//		user.setCity("Ayodhya");
//		user.setStatus("I'm Java Developer");

		// Saving single user
//		User u = userRepository.save(user);
//		System.out.println(u);

//		User user1=new User();
//		user1.setName("Uttam");
//		user1.setCity("City1");
//		user1.setStatus("Python Developer");
//		
//		User user2=new User();
//		user2.setName("Ankit");
//		user2.setCity("City2");
//		user2.setStatus("Java Developer");
//		
//		List<User> users = List.of(user1,user2);
//		
//		//Save multiple objects
//		Iterable<User> savedUsers = userRepository.saveAll(users);
//		
//		savedUsers.forEach(user->{
//			System.out.println(user);
//		});

		// Update the user of Id 2
//		Optional<User> optional = userRepository.findById(2);
//		
//		User user = optional.get();
//		System.out.println(user);
//		
//		user.setName("Uttam Tiwari");
//		User result = userRepository.save(user);
//		System.out.println(result);

		// Get the data
//		Iterable<User> userList = userRepository.findAll();
//		
//		userList.forEach(user->{
//			System.out.println(user);
//		});

//		Deleting single user
//		userRepository.deleteById(3);
//		System.out.println("User:3 is deleted");

		// Deleting all users
//		Iterable<User> allUsers = userRepository.findAll();
//		allUsers.forEach(user -> System.out.println(user));
//		userRepository.deleteAll(allUsers);

		System.out.println("============By Name==============");
		List<User> userDetail1 = userRepository.findByName("Vishal Srivastava");
		userDetail1.forEach(u1 -> System.out.println(u1));

		System.out.println("============By Name & City==============");
		List<User> findByNameAndCity = userRepository.findByNameAndCity("Shivam", "Lucknow");
		findByNameAndCity.forEach(u2 -> System.out.println(u2));

		System.out.println("============Using JPQL==============");
		List<User> allUsers = userRepository.getAllUsers();
		allUsers.forEach(u3 -> System.out.println(u3));

		System.out.println("============Using JPQL with clause==============");
		List<User> userByName = userRepository.getUserByName("Vishal Srivastava");
		userByName.forEach(u4 -> System.out.println(u4));

		System.out.println("============Using Native Query==============");
		userRepository.getUsers().forEach(u -> System.out.println(u));
		System.out.println("==============================================");

	}

}
