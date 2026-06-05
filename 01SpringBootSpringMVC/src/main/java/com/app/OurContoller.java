package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OurContoller {

	@GetMapping("/hi")
	public String openHomePage() {
		
		return "home";
	}
}
