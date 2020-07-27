package com.sezayir.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sezayir.demo.model.User;
import com.sezayir.demo.repository.UserRepository;

@Component
public class UserDao {

	@Autowired
	UserRepository repository;


	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public User createUsers(User user) {
		return repository.save(user);
	}

}
