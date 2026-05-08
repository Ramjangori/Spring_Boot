package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestDb implements CommandLineRunner {
	@Autowired
	MyDb dbconn;
	@Override
	public void run(String... args) throws Exception {
	    System.out.println(dbconn);
	}

}
