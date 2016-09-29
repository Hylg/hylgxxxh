package com.hylg.xxxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hylg.xxxh.dao.UserDao;
import com.hylg.xxxh.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public List<User> findUser(Object ob){
		return userDao.findUser(ob); 
	}
}
