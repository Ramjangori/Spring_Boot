package com.ramjan.repository;


import com.ramjan.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<Model,Integer> {
}
