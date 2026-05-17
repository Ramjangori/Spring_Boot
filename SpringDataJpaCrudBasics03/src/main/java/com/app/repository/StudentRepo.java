package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.prasoon.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
