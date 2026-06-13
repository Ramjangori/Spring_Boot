package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.UserService;

@RestController
public class UserController {
   
	@Autowired
    private UserService userService;
   
   @GetMapping("/user/{id}")
   public User getUserDetails(@PathVariable("id") int id) {
	   
	   
	   return userService.getUser(id).get();
   }
   
   @PostMapping("/addUser")
   public String addUser(@RequestBody User u) {
	   
	   userService.saveUser(u);
	   
	   return "User Added SucessFully";
   }
}
