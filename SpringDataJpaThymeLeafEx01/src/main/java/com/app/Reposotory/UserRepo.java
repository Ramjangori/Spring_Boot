package com.app.Reposotory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {

}
