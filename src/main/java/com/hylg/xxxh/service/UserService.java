package com.hylg.xxxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hylg.xxxh.dao.UserDao;
import com.hylg.xxxh.entity.Access;
import com.hylg.xxxh.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	/**
	 * 查询用户表信息
	 * @param ob
	 * @return
	 */
	public List<User> findUser(Object ob){
		return userDao.findUser(ob); 
	}
	/**
	 * 查询账户表信息
	 * @param ob
	 * @return
	 */
	public List<Access> findAccess(Object ob){
		return userDao.findAccess(ob); 
	}
	
	/**
	 * 添加用户信息
	 * @param ob
	 * @return
	 */
	public int addUser(Object ob){
		return userDao.addUser(ob);
	}
	
	/**
	 * 修改用户信息
	 * @param ob
	 * @return
	 */
	public int setUser(Object ob){
		return userDao.setUser(ob);
	}
	
	/**
	 * 使用户失效
	 * @param ob
	 * @return
	 */
	public int delUser(Object ob){
		return userDao.setUser(ob);
	}
}
