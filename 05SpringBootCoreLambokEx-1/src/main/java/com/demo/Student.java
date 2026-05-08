package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Component
@Getter
@ToString
@ConfigurationProperties("my.app")
public class Student {
	private Integer id;
	private String name;
	private String course;  
}
