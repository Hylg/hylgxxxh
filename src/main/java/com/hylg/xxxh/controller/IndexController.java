package com.hylg.xxxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 导航Controller接口
 * 
 * @author Ruby
 * @datatime 2016年9月29日上午9:36:12
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("{page}")
	public String page(@PathVariable("page") String page) {
		return page;
	}

	@RequestMapping("admin/{page}")
	public String adminPage(@PathVariable("page") String page) {
		return "admin/" + page;
	}
}
