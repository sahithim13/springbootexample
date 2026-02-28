package com.spring.springbootexample.service;

import java.util.List;

import com.spring.springbootexample.entity.Employee;

public interface EmployeeService {
	public Employee getEmployee(Long empId);
	public Employee saveEmployee(Employee e);
	public List<Employee> getAllEmployees();
}
