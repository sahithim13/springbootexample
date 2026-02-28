package com.spring.springbootexample.dao;

import java.util.List;

import com.spring.springbootexample.entity.Employee;

public interface EmployeeDao {
	public Employee getEmployee(Long empId);
	public Employee saveEmployee(Employee e);
	public List<Employee> getAllEmployees();
}
