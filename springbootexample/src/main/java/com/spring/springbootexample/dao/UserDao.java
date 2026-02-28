package com.spring.springbootexample.dao;

import com.spring.springbootexample.entity.ApplicationUser;

public interface UserDao {
	public ApplicationUser register(ApplicationUser user);
}
