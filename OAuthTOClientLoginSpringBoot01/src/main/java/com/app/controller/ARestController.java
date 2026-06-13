package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ARestController {

	@GetMapping("/info")
	public String getData() {
		
		return "prasoon Bidua";
	}
}
