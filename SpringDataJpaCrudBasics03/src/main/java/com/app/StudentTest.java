 package com.app;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.app.prasoon.entity.Student;
import com.app.repository.StudentRepo;


@Component
public class StudentTest implements CommandLineRunner {
	 @Autowired
     StudentRepo repo;
	@Override
	public void run(String... args) throws Exception {
		Student s = new Student();
		 s.setName("Ramjan Gori");
		 s.setFee(20030.0);
		 s.setDob(new Date());
		 repo.save(s);
// Save multiple Students 
		 Student s3 = new Student("surender",2000.0,new Date());
		 Student s4 = new Student("Aman Khan",20500.0,new Date());
		 Student s5 = new Student("Rohit Kumar",50030.0,new Date());
		 repo.saveAll(Arrays.asList(s3,s4,s5));
		 List<Student> list = repo.findAll();
		   list.forEach(System.out::println);
		 
//		 Student s2 = new Student();
//		 s2.setName("Sameer");
//		 s2.setFee(40000.0);
//		  repo.save(s2);
//		
//		  Example<Student> prob = Example.of(s2);
//		     List<Student> ss = repo.findAll(prob);
//		     System.out.println(ss);
	}

}
