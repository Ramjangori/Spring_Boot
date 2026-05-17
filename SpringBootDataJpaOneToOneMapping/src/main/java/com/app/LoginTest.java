package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Repository.LoginRepo;
import com.app.entity.Login;
import com.app.entity.Student;

@Component
public class LoginTest implements CommandLineRunner {
     
	@Autowired
	private LoginRepo loginrepo;
	@Override
	public void run(String... args) throws Exception {
		 
		Student s = new Student();
		 s.setName("Ramjan gori");
		 s.setAddress("Jaipur");
		 
		 Login login = new Login();
		 
		 login.setUsername("ramjangori232");
		 login.setPassword("Ramjan937873");
		 login.setStudent(s);
		
		 loginrepo.save(login);
	}

}
