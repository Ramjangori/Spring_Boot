package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface StudentService {
  
	
	public List<Student> findByNameThatMatch(String name);
	
	public String addStudent(Student s);
	
	public List<Student> findStudentAgeGreaterThan(int age);
}
