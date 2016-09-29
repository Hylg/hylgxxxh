package com.hylg.xxxh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hylg.xxxh.entity.ResultJson;
import com.hylg.xxxh.service.UserService;

/**
 * 用户Controller接口
 * 
 * @author Ruby
 * @datatime 2016年9月29日上午9:37:58
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("findUser")
	public ResultJson findUser(){
		ResultJson json = new ResultJson();
		userService.findUser(null);
		return json;
	}
}
