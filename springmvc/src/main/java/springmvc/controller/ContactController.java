package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Registration Page");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {	
		return "contact";
	}

	// Fetching data from view to controller using HttpServlet
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(HttpServletRequest request) { String email =
	 * request.getParameter("email"); System.out.println("User's email address: " +
	 * email); return ""; }
	 */

	// Fetching data from view to controller using @RequestParam annotation
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam(name="email", required = true) String userEmail,
	 * 
	 * @RequestParam(name="userName", required = true) String userName,
	 * 
	 * @RequestParam(name="password", required= true) String userPassword, Model
	 * model) { System.out.println("User Email: "+userEmail);
	 * System.out.println("User name: "+userName);
	 * System.out.println("User Password: "+userPassword);
	 * 
	 * model.addAttribute("email", userEmail); model.addAttribute("name", userName);
	 * model.addAttribute("password", userPassword); return "success"; }
	 */

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with ID: "+createdUser);
		//model.addAttribute("user", user);
		return "success";
	}

}
