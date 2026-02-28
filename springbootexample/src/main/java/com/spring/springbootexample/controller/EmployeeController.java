package com.spring.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootexample.entity.Employee;
import com.spring.springbootexample.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/get/{empId}")
	public Employee getEmployee(@PathVariable("empId") Long empId) {
		Employee emp = service.getEmployee(empId);
		return emp;
	}
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee emp = service.saveEmployee(employee);
		return emp;
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		List<Employee> empList = service.getAllEmployees();
		return empList;
	}
}
