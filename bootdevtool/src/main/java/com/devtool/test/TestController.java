package com.devtool.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=10;
		int b=20;
		int c=50;
		return "This is for DevTools Testing. Sum of a,b & c is: "+(a+b+c);
	}
}
