package com.app.service;

import org.springframework.stereotype.Service;

import com.app.entity.User;



@Service
public interface UserService {
     
	  public String register(User user);
}
