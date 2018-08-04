package com.practice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(password.equals("admin")) {
			String message = "Hello "+name;
			return new ModelAndView("hellopage", "message", message);
		}else {
			return new ModelAndView("errorpage", "message", "Sorry username and password error");
		}
	}

}
