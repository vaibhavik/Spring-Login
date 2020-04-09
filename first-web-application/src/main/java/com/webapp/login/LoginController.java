package com.webapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class LoginController {
	
	//Set the login service by using @Autowired
	@Autowired
	LoginService service;
	
	// for spring-mvc/login
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@ResponseBody	//dispatcher sends this back as a response
	public String showLoginPage() {
		return "login";
	}
	
	// for handling post requests
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(!service.isUservalid(name,password)) {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
		model.put("name", name);
		model.put("password",password);
		return "welcome";
		
	}

}
