package com.sezayir.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sezayir.demo.dao.UserDao;
import com.sezayir.demo.model.User;


@Service
public class UserService {

	@Autowired
	UserDao  userdao;
	
	public List<User> getAllUsers() {
		return userdao.getAllUsers();
	}

	public User create(User user) {
		return userdao.createUsers(user);
	}

}
