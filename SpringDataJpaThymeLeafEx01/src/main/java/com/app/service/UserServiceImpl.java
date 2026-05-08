package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Reposotory.UserRepo;
import com.app.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo repo;

	@Override
	public String register(User user) {
		 
		  try {
			  repo.save(user);
			  return " Registration Success";
		  }
		 catch(Exception e) {
			 
			 return "Failed";
		 }
		
	}

}
