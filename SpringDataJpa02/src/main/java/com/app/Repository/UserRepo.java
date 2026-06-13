package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.app.entity.User;

public interface UserRepo extends CrudRepository<User,Long> {
	
	@Query("select p from User p where p.name = :name")
	User getUserByName(@Param("name") String name);
	  
}
