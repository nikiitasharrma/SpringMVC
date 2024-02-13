package com.spring.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {      
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home controller!");
		
		model.addAttribute("name", "Nikita Sharma");
		model.addAttribute("age", 22);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Nandini");
		friends.add("Urvashi");
		
		model.addAttribute("f",friends);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("about controller method!");
		return "about";
	}
}
