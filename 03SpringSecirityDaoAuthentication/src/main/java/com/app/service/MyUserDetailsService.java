package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.entity.Users;
import com.app.repository.UserRepository;

@Service
public class MyUserDetailsService  implements UserDetailsService{
  
	@Autowired
	private UserRepository  userRepo;
	
	
	 @Override
	    public UserDetails loadUserByUsername(
	            String username)
	            throws UsernameNotFoundException {

	        Users user =
	                userRepo.findByName(username);

	        if (user == null) {
	            throw new UsernameNotFoundException(
	                    "User Not Found");
	        }

	        return new UserInformation(user);
	    }
 
}
