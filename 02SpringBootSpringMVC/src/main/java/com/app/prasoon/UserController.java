package com.app.prasoon;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    
	@RequestMapping(value="/info" , method=RequestMethod.GET)
	public String  showUser(Map<String,Object> map) {
		  map.put("userName","Prasoon Biduva");
		  map.put("CourseName","Java Full Stack");
		
		return "userHome";
	}
	@RequestMapping(value="/info1" , method=RequestMethod.GET)
	public String  showUser(Model model) {
		   User u = new User(1,"Ramjan","Student");
		   model.addAttribute("User",u);
		   System.out.println(u.getId());
		   
		
		return "userData";
	}
}
