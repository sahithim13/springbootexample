package com.spring.springbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springbootexample.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
