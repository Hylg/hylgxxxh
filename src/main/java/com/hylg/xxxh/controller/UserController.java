package com.hylg.xxxh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private final Logger LOG = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("findUser")
	public ResultJson findUser() {
		ResultJson json = new ResultJson();
		userService.findUser(null);
		return json;
	}

	@RequestMapping("addUser")
	public ResultJson addUser() {
		ResultJson json = new ResultJson();
		userService.addUser(null);
		return json;
	}

	@RequestMapping("delUser")
	public ResultJson delUser() {
		ResultJson json = new ResultJson();
		userService.delUser(null);
		return json;
	}

	@RequestMapping("setUser")
	public ResultJson setUser() {
		ResultJson json = new ResultJson();
		userService.setUser(null);
		return json;
	}
}
