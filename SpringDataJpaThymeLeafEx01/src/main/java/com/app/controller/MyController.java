package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.User;
import com.app.service.UserService;

@Controller
public class MyController {
    @Autowired
   UserService service;
	
	@GetMapping("/regPage")
	public String openRegPage(Model model) {
		 model.addAttribute("user",new User());
		
		return "register";
	}
	@PostMapping("/regForm")
	public String registerUser(@ModelAttribute("user")  User user ,Model model) {
		
		  String result = service.register(user);
		  model.addAttribute("result",result);
		  model.addAttribute("user", new User());
		  
		  
		  return "register";
		 
	}
}
