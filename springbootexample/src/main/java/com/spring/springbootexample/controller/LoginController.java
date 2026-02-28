package com.spring.springbootexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootexample.entity.ApplicationUser;
import com.spring.springbootexample.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "success";	
	}
	
	@PostMapping("/registration")
	public ApplicationUser register(@RequestBody ApplicationUser user) {
		return userService.register(user);
	}
}
