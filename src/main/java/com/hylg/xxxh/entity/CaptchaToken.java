package com.hylg.xxxh.entity;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 扩展 UsernamePasswordTokenShiro 表单认证，页面提交的用户名密码等信息，用 UsernamePasswordToken
 * 类来接收，很容易想到，要接收页面验证码的输入，我们需要扩展此类
 * 
 * @author ZDST
 * @Date Aug 12, 2015 3:45:31 PM
 */
public class CaptchaToken extends UsernamePasswordToken {
	private static final long serialVersionUID = 1L;
	// 验证码字符串
	private String captcha;

	public CaptchaToken(String username, char[] password, boolean rememberMe, String host,
			String captcha) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

}
