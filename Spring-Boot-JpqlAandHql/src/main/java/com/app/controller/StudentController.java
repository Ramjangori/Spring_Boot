package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student/name/{name}")
	public List<Student> getStudentByNameMatch(@PathVariable("name") String name){
		
		return studentService.findByNameThatMatch(name);
	}
	
	@PostMapping("/student/add")
	public String addStudent(@RequestBody Student s) {
		
		 studentService.addStudent(s);
		 
		 return "added Sucessfully";
	}
	
	@GetMapping("/student/age/{age}")
	public List<Student> getStudentAgeGreaterThan(@PathVariable("age") int age){
		return studentService.findStudentAgeGreaterThan(age);
		
	}
}
