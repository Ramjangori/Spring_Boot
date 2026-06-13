package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.UserRegisteration;



public interface RegisterRepo extends JpaRepository<UserRegisteration,Integer> {

	 public Optional<UserRegisteration> findUserByUsernameAndPasswoed(String user , String pass);
}
