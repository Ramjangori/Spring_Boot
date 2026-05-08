package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbCheckCon implements CommandLineRunner {
	
	@Autowired
	DbConnection con;

	@Override
	public void run(String... args) throws Exception {
		 System.out.println(con);
		
	}

}
