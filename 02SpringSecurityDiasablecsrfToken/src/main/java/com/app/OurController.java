package com.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import jakarta.servlet.http.HttpServletRequest;

@RestController
public class OurController {

	 List<Employee> list = new ArrayList<>(Arrays.asList(new Employee(1,"Ramjan",3483,"Jaipur"),
			  new Employee(2,"Sameer",49999,"jodhpur"),new Employee(3,"Nitesh",20000,"Bikaner")));
	  
	 @GetMapping("/get-employees")
	 public List<Employee> getEmployees() {
		 
		 return list;
	 }
	 
	 @PostMapping("/add-employee")
	 public void addEmployee(@RequestBody Employee e) {
		 list.add(e);
	 }
	 
	 @GetMapping("/get-info")
	 public String getInfo(HttpServletRequest req) {
		 
		 return "Session if " + req.getSession().getId();
	 }
	
	
}
