package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
	 @Autowired
	    private JavaMailSender mailSender;

	    public void sendEmail() {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setFrom("ramjangori6666gmail.com");
	        message.setTo("niteshsinghns2003@gmail.com"); 
	        message.setSubject("Interview Schedule at Regex Software Services");
	        message.setText("Hay Dear NItesh Your Resume is shortlisted in our Company at Role Mern Stack Developer Our hiring  team review your skills and fruther connect to you ...  for help : 8107741679  ");

	        mailSender.send(message);
	        System.out.println("Mail sent successfully!");
	    }
}
