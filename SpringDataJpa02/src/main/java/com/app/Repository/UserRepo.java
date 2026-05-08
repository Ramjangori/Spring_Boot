package com.app.Repository;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.User;

public interface UserRepo extends CrudRepository<User,Long> {
	
	 

}
