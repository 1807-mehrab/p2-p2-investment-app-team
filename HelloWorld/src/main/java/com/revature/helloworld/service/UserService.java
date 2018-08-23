package com.revature.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.helloworld.DAO.UserDao;
import com.revature.helloworld.model.User;

@Service
public class UserService {
	@Autowired 
	UserDao dao;
	
	public void setUserDao(UserDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public User retrieveUser(String username){
		return dao.getUserByUsername(username);
	}
}
