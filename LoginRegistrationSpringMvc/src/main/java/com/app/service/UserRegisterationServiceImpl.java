package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.UserRegisteration;
import com.app.repository.RegisterRepo;

@Service
public class UserRegisterationServiceImpl implements UserRegisterService {
	
	@Autowired
	private RegisterRepo registerRepo;

	@Override
	public UserRegisteration addUser(UserRegisteration user) {
		
		return registerRepo.save(user);
	}

	@Override
	public  Optional<UserRegisteration> getUser(String username , String pass) {
		
		return registerRepo.findUserByUsernameAndPasswoed(username , pass);
	}

}
