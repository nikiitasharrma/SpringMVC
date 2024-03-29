package com.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.dao.UserService;
import com.spring.mvc.models.User;

@Controller
public class FormController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{user_id}")
	public String getUser(@PathVariable("user_id") int userId, Model m) {
		User user = userService.getUser(userId);
		System.out.println(user);
		m.addAttribute("user",user);
		return "userSelected";
	}
	
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
		
		//Check for nullPointerExcHandler method
//		String str=null; System.out.println(str.length());
		
		//Check for numberFormatExcHandler method
//		String str = "nikita";
//		int i = Integer.parseInt(str);
//		System.out.println(i);
		
		//Check for ExcHandler method
//		Object obj = "Hello";
//	    Integer intValue = (Integer) obj;
		
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
