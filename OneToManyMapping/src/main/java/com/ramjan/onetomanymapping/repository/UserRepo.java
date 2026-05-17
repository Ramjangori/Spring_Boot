package com.ramjan.onetomanymapping.repository;

import com.ramjan.onetomanymapping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
