package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("Inside about handler...");
		model.addAttribute("name", "Vishal Srivastava");
		model.addAttribute("currentDate", new Date().toString());
		return "about";
		// about.html
	}

	// Handling Iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		List<String> names = List.of("Ankit", "Laxmi", "Karan", "John");
		m.addAttribute("names", names);
		return "iterate";
	}

	// Handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("Condition handler executed");
		// Elvis
		m.addAttribute("isActive", false);
		// if-unless
		m.addAttribute("gender", "F");
		// switch
		List<Integer> list = List.of(1);
		m.addAttribute("mylist", list);
		return "condition";
	}

	// Handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("contactNo", "+91-9935495382");
		m.addAttribute("email", "vishalsrivi123@gmail.com");
		return "service";
	}

	// For aboutnew- inheritance
	@GetMapping("/aboutnew")
	public String newAbout() {
		return "aboutnew";
	}

	// For contact- inheritance
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

}
