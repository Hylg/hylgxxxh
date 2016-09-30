package com.hylg.xxxh.dao;

import java.util.List;

import com.hylg.xxxh.entity.Access;
import com.hylg.xxxh.entity.AccessType;
import com.hylg.xxxh.entity.User;

public interface UserDao {
	
	//查询用户表信息
	public List<User> findUser(Object ob);
	
	//查询账户表信息
	public List<Access> findAccess(Object ob);
	
	//查询账户表类型信息
	public List<AccessType> findAccessType(Object ob);
	
	//添加用户信息
	public int addUser(Object ob);
	
	//添加账户信息
	public int addAccess(Object ob);

	//添加账户类型信息
	public int addAccessType(Object ob);
	
	//修改用户信息
	public int setUser(Object ob);
	
	//修改账户信息
	public int setAccess(Object ob);
	
	//修改账户类型信息
	public int setAccessType(Object ob);
}
