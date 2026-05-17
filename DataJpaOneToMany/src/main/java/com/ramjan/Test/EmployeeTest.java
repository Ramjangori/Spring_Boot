package com.ramjan.Test;

import com.ramjan.entity.Department;
import com.ramjan.entity.Employee;
import com.ramjan.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmployeeTest implements CommandLineRunner {
    @Autowired
    private EmployeeRepo repo;


    @Override
    public void run(String... args) throws Exception {
//        Department d1 = new Department();
//        d1.setName("Marketing");
//        d1.setHead("Surender");
//
//        Department d2 = new Department();
//        d2.setName("Development");
//        d2.setHead("Sameer");
//
//        Employee e1 = new Employee();
//        e1.setName("Ramjan gori");
//        e1.setSalary(23432);
//        e1.setDepartment(d1);
//
//        Employee e2 = new Employee();
//        e2.setName("Aman Khan");
//        e2.setSalary(2339);
//        e2.setDepartment(d1);
//
//        Employee e3 = new Employee();
//        e3.setName("Aman Khan");
//        e3.setSalary(2339);
//        e3.setDepartment(d2);
//
//        repo.saveAll(Arrays.asList(e1,e2,e3));
    }
}
