package com.jaroslav.spring.mvc_hibernate_aop.service;

import com.jaroslav.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
}
