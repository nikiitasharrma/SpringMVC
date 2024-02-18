package com.spring.mvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.models.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		int id = (Integer) hibernateTemplate.save(user);
		return id;
	}
	
	public User selectUser(int userId) {
		User user = hibernateTemplate.get(User.class, userId);
		return user;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
