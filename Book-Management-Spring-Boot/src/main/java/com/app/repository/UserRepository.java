package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

	  public Optional<Users> findByUsername(String username);
}
