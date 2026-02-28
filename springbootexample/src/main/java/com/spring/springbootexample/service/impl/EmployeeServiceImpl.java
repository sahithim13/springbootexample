package com.spring.springbootexample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springbootexample.dao.EmployeeDao;
import com.spring.springbootexample.entity.Employee;
import com.spring.springbootexample.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee getEmployee(Long empId) {
		Employee emp = dao.getEmployee(empId);
		return emp;
	}

	@Override
	public Employee saveEmployee(Employee e) {
		Employee emp = dao.saveEmployee(e);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = dao.getAllEmployees();
		return empList;
	}

}
