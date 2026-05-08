package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDb {
	@Value("${com.db.driver}")
	private String Driver;
	@Value("${com.db.server}")
	private String server;
	@Value("${com.db.userName}")
	private String userName;
	@Value("${com.db.password}")
	private String password;
	@Override
	public String toString() {
		return "MyDb [Driver=" + Driver + ", server=" + server + ", userName=" + userName + ", password=" + password
				+ "]";
	}
 
}
