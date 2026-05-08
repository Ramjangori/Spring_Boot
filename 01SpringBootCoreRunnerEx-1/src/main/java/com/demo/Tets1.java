package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(20)
public class Tets1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Ramjan This is Test 1");
		
	}

}
