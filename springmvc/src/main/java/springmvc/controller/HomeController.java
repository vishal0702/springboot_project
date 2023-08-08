package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Vishal Srivastava");
		model.addAttribute("contactNo", "+91-9935495382");

		List<String> friends = new ArrayList<String>();
		friends.add("Sudhakar");
		friends.add("Suraj");

		model.addAttribute("frnds", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help page");
		
		//creating model & view object
		ModelAndView modelAndView=new ModelAndView();
		
		//setting the data
		modelAndView.addObject("helpdesk", "05278-221188");
		modelAndView.addObject("Pincode", 224001);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		//setting the view
		modelAndView.setViewName("help");
		
		//IDs
		List<Integer> list=new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);
		
		modelAndView.addObject("ids", list);
		
		return modelAndView;
	}
}
