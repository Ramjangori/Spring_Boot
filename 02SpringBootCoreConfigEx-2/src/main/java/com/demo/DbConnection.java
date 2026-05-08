package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties("com.demo")
@Component
public class DbConnection {
	private String Driver;
	private String UserName;
	
	private String Server;
	private String Password;
	public String getDriver() {
		return Driver;
	}
	public void setDriver(String driver) {
		Driver = driver;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getServer() {
		return Server;
	}
	public void setServer(String server) {
		Server = server;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "DbConnection [Driver=" + Driver + ", UserName=" + UserName + ", Server=" + Server + ", Password="
				+ Password + "]";
	}

}
