package com.app.prasoon;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    
	private  int id;
	private String name;
	private String roll;
	
}
