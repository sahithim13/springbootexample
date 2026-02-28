package com.spring.springbootexample.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.springbootexample.dao.EmployeeDao;
import com.spring.springbootexample.entity.Employee;
import com.spring.springbootexample.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee getEmployee(Long empId) {
		Employee emp = repo.findById(empId).get();
		return emp;
	}

	@Override
	public Employee saveEmployee(Employee e) {
		Employee emp = repo.save(e);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = repo.findAll();
		return empList;
	}

}
