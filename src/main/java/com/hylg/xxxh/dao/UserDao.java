package com.hylg.xxxh.dao;

import java.util.List;

import com.hylg.xxxh.entity.User;

public interface UserDao {
	
	//查询用户表信息
	public List<User> findUser(Object ob);
	
	//添加用户信息
	public int addUser(Object ob);
	
	//修改用户信息
	public int setUser(Object ob);
}
