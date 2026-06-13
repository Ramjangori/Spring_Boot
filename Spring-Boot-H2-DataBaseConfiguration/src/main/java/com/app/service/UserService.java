package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.entity.User;
import com.app.repositoty.UserRepository;

@Component
public class UserService {

	@Autowired
	UserRepository userRepo;

	public Optional<User> getUser(int id) {

		return userRepo.findById(id);

	}

	public User saveUser(User u) {

		return userRepo.save(u);
	}
}
