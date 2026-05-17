package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	private final Person person;

	Application(Person person) {
		this.person = person;
	}

	public static void main(String[] args) {
	 ApplicationContext ac = SpringApplication.run(Application.class, args);
	 
	 
	 Animal a = ac.getBean(Animal.class);
	 Animal b = ac.getBean(Animal.class);
	 System.out.println("Singleton bean ");
	 System.out.println(a==b);
	 
	 System.out.println(a.hashCode());
	 System.out.println(b.hashCode());
	 
	 Person p = ac.getBean(Person.class);
	 Person p2 = ac.getBean(Person.class);
	 System.out.println("Protype bean ");
	 System.out.println(p==p2);
	 
	 System.out.println(p.hashCode());
	 System.out.println(p2.hashCode());
	 
	 
	}

}
 