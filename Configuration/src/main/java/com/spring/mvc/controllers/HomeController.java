package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {      
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home controller!");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("about controller method!");
		return "about";
	}
}
