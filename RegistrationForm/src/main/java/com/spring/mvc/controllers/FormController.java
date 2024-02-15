package com.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.dao.UserService;
import com.spring.mvc.models.User;

@Controller
public class FormController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("heading", "Registration Form");
		m.addAttribute("desc", "We will send you notifications");
	}
	
	@RequestMapping("/register")
	public String showView() {
		return "form";
	}
	
	@RequestMapping(path="/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user) {
		
		if(user.getEmail().isBlank() || user.getUserName().isBlank() || user.getPassword().isBlank()) {
			return "redirect:/register";
		}
		userService.createUser(user);
		return "success";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
