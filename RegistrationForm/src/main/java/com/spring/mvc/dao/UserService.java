package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.models.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		int id = (Integer) userDao.saveUser(user);
		return id;
	}
	
	public User getUser(int userId) {
		User user = userDao.selectUser(userId);
		return user;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
