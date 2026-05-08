package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Test  implements CommandLineRunner{
	@Autowired
	Student s1;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(s1);
		
	}
}
