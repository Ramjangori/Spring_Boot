package com.app.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Users;
import com.app.repository.UserRepository;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String registerUser(@RequestBody Users user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("User");
        userRepository.save(user);

        return "User Register Successfully";
    }
    
   

   
}
