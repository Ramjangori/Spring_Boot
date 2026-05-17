package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Login;

public interface LoginRepo extends JpaRepository<Login, Integer> {

}
