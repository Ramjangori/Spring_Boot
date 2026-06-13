package com.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Course;

@Controller
public class EmployeeController {
	List<Course> course = new ArrayList<>(
			 Arrays.asList(new Course(1,"java","10 Months",55000.0),
					 new Course(2,"Mern","6 Months",40000.0)));
 
	@GetMapping("/home")
	public String home(Model model) {
		  model.addAttribute("course",course);
		
		  return "home";
	}
	
	@GetMapping("/deleteCourse")
	public String deleteCourse(@RequestParam int id) {
		 course.removeIf(emp-> emp.getId()==id);
		
		return "redirect:/home";
		
	}
	
	@GetMapping("/editCourse")
	public String openEditPage(Model model , @RequestParam int id) {
		Course foundCourse = course.stream()
		        .filter(c -> c.getId() == id)
		        .findFirst()
		        .orElse(null);
		
		model.addAttribute("course",foundCourse);
		return "edit";
		 
	}
	
	@PostMapping("/updateCourse")
	public String updateCourse(@ModelAttribute Course c) {
		
		course.forEach(e->{
			if(e.getId()==c.getId()) {
				e.setName(c.getName());
				e.setDuration(c.getDuration());
				e.setFees(c.getFees());
			}
		});
		
		return "redirect:/home";
		
	}
	
}
