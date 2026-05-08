package com.app;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.prasoon.entity.Employees;
import com.app.repository.EmployeeRepo;

@SpringBootApplication
public class SpringDataJpaCrudBasics03Application implements CommandLineRunner {
	
	  @Autowired
	 EmployeeRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaCrudBasics03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 Employees e1 = new Employees(1,"Ramjan",15000,"Jaipur");
		 Employees e2 = new Employees(2,"Sameer",20000,"Jaipur");
		 Employees e3 = new Employees(3,"Surender",30000,"Jaipur");
		 Employees e4 = new Employees(4,"Prasoon sir",1000000,"Jaipur");
		      repo.saveAll(Arrays.asList(e1,e2,e3,e4));
		      
		      
		      System.out.println("Finding all Employees ");
		      Iterable<Employees> employees = repo.findAll();
		      employees.forEach(ob->System.out.println(ob));
		      
		      
		      System.out.println("FInding Employee by Id ");
		      Optional<Employees> e = repo.findById(2);
		      
		      if(e.isPresent()) {
		    	  System.out.println(e.get());
		      }
		      else {
		    	  System.out.println("Employee not found");
		      }
	}

}
