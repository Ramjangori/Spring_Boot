package com.app.service;

import org.springframework.data.domain.Page;

import com.app.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Page<Employee> getAllEmployees(int page , int size);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}