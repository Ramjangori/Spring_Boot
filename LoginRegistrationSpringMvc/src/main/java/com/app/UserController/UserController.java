package com.app.UserController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.UserRegisteration;
import com.app.service.UserRegisterService;

@Controller
public class UserController {
	
	@Autowired
	private UserRegisterService userService;
	
	@GetMapping("/login")
	public String Home() {
		
		return "login";
	}

	@PostMapping("/register")
	public String addUser(@ModelAttribute UserRegisteration user) {
		
		userService.addUser(user);
		
		return "login";
	}


  @PostMapping("/login")
  public String getUser(@ModelAttribute UserRegisteration user) {
	  String userName = user.getUsername();
	  String passWord = user.getPassword();
	  
	  Optional<UserRegisteration> dbUser = userService.getUser(userName,passWord);
	  if(dbUser.isEmpty()) {
		  throw new RuntimeException("User Not Found ....");
	  }
	  else {
		  if(dbUser.get().getUsername().equals(userName) && dbUser.get().getPassword().equals(passWord)) {
			  
			   return "success";
		  }
		  else {
			  throw new RuntimeException("Password or Username Not matched");
		  }
	  }
	  
	  
	 
	  
  }
}