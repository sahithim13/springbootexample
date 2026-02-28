package com.spring.springbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springbootexample.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);

}
