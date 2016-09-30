package com.hylg.xxxh.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 验证码校验不通过，我们抛出一个异常 IncorrectCaptchaException，此类继承
 * AuthenticationException，之所以需要扩展一个新的异常类，为的是在页面能更精准显示错误提示信息
 * 
 * @author ZDST
 * @Date Aug 12, 2015 3:40:42 PM
 */
public class IncorrectCaptchaException extends AuthenticationException {

	private static final long serialVersionUID = 1L;

	public IncorrectCaptchaException() {
		super();
	}

	public IncorrectCaptchaException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectCaptchaException(String message) {
		super(message);
	}

	public IncorrectCaptchaException(Throwable cause) {
		super(cause);
	}
}
