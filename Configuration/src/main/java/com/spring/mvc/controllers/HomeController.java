package com.spring.mvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView about() {
		System.out.println("about controller method!");
		
		ModelAndView modelView = new ModelAndView();
		
		modelView.addObject("email", "nikitans1631@gmail.com");
		modelView.setViewName("about");
		LocalDateTime now = LocalDateTime.now();
		modelView.addObject("time", now);
		
		return modelView;
	}
}
