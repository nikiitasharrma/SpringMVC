package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.models.User;

@Controller
public class FormController {
	
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
	public String processForm(@ModelAttribute User user, Model mv) {
		return "success";
	}
}
