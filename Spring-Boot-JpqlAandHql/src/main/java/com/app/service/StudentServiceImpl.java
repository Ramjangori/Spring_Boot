package com.app.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findByNameThatMatch(String name) {
        return studentRepository.findStudentByNameThatMatch(name);
    }

	@Override
	public String addStudent(Student s) {
		 studentRepository.save(s);
		return "Student added ";
	}

	@Override
	public List<Student> findStudentAgeGreaterThan(int age) {
		
		return studentRepository.findStudentsAgeGreaterThan(age);
	}

	
}