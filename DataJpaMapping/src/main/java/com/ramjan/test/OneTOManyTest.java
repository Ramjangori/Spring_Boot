package com.ramjan.test;

import com.ramjan.Repository.DepartmentRepo;
import com.ramjan.entity.Department;
import com.ramjan.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OneTOManyTest implements CommandLineRunner {

    @Autowired
    DepartmentRepo repo;

    @Override
    public void run(String... args) throws Exception {
//        Department d = new Department();
//        d.setContact_Number(810774167);
//        d.setName("software Engineering");
//        d.setDept_Head("Mr Ramjan");
//
//        Department d2 = new Department();
//        d2.setContact_Number(83789895);
//        d2.setName("Development");
//        d2.setDept_Head("Rohit");
//
//
//        // Emolpyee object
//         Employee e1 = new Employee();
//         e1.setName("Aman Khan");
//         e1.setAddress("jaipur");
//         e1.setSalary(20000);
//         e1.setDepartment(d);
//
//        Employee e2 = new Employee();
//        e2.setName("Sameer");
//        e2.setAddress("Udaipur");
//        e2.setSalary(40000);
//        e2.setDepartment(d);
//
//        Employee e3 = new Employee();
//        e3.setName("Surendra Bajia");
//        e3.setAddress("jaipur");
//        e3.setSalary(50000);
//        e3.setDepartment(d2);
//
//        d.getEmployees().add(e1);
//        d.getEmployees().add(e2);
//        d2.getEmployees().add(e3);
//
//        repo.save(d);
//        repo.save(d2);


    }
}
