package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(-90)
public class Test2 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Hello Ramjan This is Test 2");
		
	}

}
