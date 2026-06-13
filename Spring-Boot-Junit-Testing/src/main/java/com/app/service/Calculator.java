package com.app.service;

import org.springframework.stereotype.Component;

@Component
public class Calculator<T> {
  
	  public static int addNumbers(int... n) {
	        int sum = 0;

	        for(int num : n) {
	            sum += num;
	        }

	        return sum;
	    }
}
