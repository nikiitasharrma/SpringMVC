package com.spring.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FormExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerExcHandler(Model m) {
		m.addAttribute("msg","Null Pointer Exception occured!");
		return "error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String nulmberFormatExcHandler(Model m) {
		m.addAttribute("msg","Number Format Exception occured!");
		return "error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String ExcHandler(Model m) {
		m.addAttribute("msg", "Some Exception occured!");
		return "error";
	}
}
