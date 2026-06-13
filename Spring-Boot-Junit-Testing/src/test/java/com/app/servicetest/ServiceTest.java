package com.app.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.app.service.Calculator;


public class ServiceTest {

	@Test
	void AddNumberTest() {
		
		int result = Calculator.addNumbers(10,20,30,40);
		 assertEquals(100, result);
		 assertTrue(result > 200);
		
	}
	
	
	
	 
}
