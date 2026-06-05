package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

	
	@GetMapping("/form")
	public String openForm() {
		
		return "form";
	}
	@PostMapping("/register")
	public String showFormData(@ModelAttribute Employee emp , Model model) {
		 
		  model.addAttribute("Data", emp);
		
		
		return "formData";
	}
}
