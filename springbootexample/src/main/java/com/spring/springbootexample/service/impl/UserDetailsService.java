package com.spring.springbootexample.service.impl;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.springbootexample.entity.ApplicationUser;
import com.spring.springbootexample.entity.Role;
import com.spring.springbootexample.repository.RoleRepository;
import com.spring.springbootexample.repository.UserRepository;

@Service
public class UserDetailsService {
	private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserDetailsService(UserRepository userRepository,
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public ApplicationUser findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public ApplicationUser findUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public ApplicationUser saveUser(ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return userRepository.save(user);
    }
}
