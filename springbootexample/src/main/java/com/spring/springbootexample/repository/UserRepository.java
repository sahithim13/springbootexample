package com.spring.springbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springbootexample.entity.ApplicationUser;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByEmail(String email);
    ApplicationUser findByUserName(String userName);
}
