package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDemo1 implements CommandLineRunner{
	@Autowired
	Demo1 d;

	@Override
	public void run(String... args) throws Exception {
	   System.out.print(d);
		
	}
	

}
