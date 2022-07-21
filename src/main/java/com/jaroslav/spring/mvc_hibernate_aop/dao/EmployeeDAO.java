package com.jaroslav.spring.mvc_hibernate_aop.dao;

import com.jaroslav.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();
}
