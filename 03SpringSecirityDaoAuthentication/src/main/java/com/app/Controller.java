package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;

@RestController
@RequestMapping("/emp")
public class Controller {
	 List<Employee> list = new ArrayList<>(Arrays.asList(new Employee(1,"Ramjan",3483,"Jaipur"),
			  new Employee(2,"Sameer",49999,"jodhpur"),new Employee(3,"Nitesh",20000,"Bikaner")));
	  
	 @GetMapping("/get_employees")
	 public List<Employee> getEmployees() {
		 
		 return list;
	 }
	 
	 @PostMapping("/add_employee")
	 public void addEmployee(@RequestBody Employee e) {
		 list.add(e);
	 }
	 
}
