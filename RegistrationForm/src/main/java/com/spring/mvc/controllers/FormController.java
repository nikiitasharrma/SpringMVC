package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@RequestMapping("/register")
	public String showView() {
		return "form";
	}
	
	@RequestMapping(path="/processForm", method = RequestMethod.POST)
	public ModelAndView processForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName, 
			                  @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("email",userEmail);
		mv.addObject("userName",userName);
		mv.addObject("password",password);
		
		mv.setViewName("success");
		
		return mv;
	}
}
