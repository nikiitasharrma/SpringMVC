package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerInterceptor;

@Controller
public class InterceptorController implements HandlerInterceptor  {
	
	@RequestMapping(path="/name")
	public String showView() {
		return "yourName";
	}
	
	@RequestMapping("/welcome")
	public String handleHello(@RequestParam("userName") String name, Model m) {
		m.addAttribute("name",name);
		return "welcome";
	}
}
