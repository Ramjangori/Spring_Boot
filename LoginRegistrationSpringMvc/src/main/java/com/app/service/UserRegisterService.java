package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.entity.UserRegisteration;
import com.app.repository.RegisterRepo;

public interface UserRegisterService {
	

	 public UserRegisteration addUser(UserRegisteration user);
	 public Optional<UserRegisteration> getUser(String user ,String pass);
	 
	 
}
		
	
