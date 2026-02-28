package com.spring.springbootexample.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.springbootexample.dao.UserDao;
import com.spring.springbootexample.entity.ApplicationUser;
import com.spring.springbootexample.repository.RoleRepository;
import com.spring.springbootexample.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public ApplicationUser register(ApplicationUser user) {
		roleRepo.saveAll(user.getRoles());
		return repo.save(user);
	}

}
