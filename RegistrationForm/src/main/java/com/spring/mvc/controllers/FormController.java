package com.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

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
	public String processForm(@ModelAttribute User user, BindingResult result) {
		
		if(result.hasErrors()){
			return "form";
		}
		userService.createUser(user);
		return "success";
	}
	
	@RequestMapping("/help")
	public RedirectView help() {
		RedirectView rv = new RedirectView();
		rv.setUrl("https://www.google.com");
		return rv;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
