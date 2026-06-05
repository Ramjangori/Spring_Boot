package com.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
     private int empId;
     private  String emp_name;
     private  long salary;
     private  String address;
     
}
