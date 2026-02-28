package com.spring.springbootexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springbootexample.dao.UserDao;
import com.spring.springbootexample.entity.ApplicationUser;
import com.spring.springbootexample.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public ApplicationUser register(ApplicationUser user) {
		return userDao.register(user);
	}

}
