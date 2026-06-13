package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
    private  EmployeeService service;

   
    @PostMapping
    public Employee saveEmployee(
            @Valid @RequestBody Employee employee) {

        return service.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(
            @PathVariable Long id) {

        return service.getEmployeeById(id);
    }

    @GetMapping
    public Page<Employee> getAllEmployees(

            @RequestParam(defaultValue = "0")
            int page,

            @RequestParam(defaultValue = "5")
            int size) {

        return service.getAllEmployees(page, size);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(
           @Valid @PathVariable Long id,
           @Valid @RequestBody Employee employee) {

        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(
            @PathVariable Long id) {

        service.deleteEmployee(id);

        return "Employee Deleted Successfully";
    }
}