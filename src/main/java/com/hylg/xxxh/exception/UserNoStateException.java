package com.hylg.xxxh.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 用户未激活，我们抛出一个异常 UserNoStateException，此类继承
 * AuthenticationException，之所以需要扩展一个新的异常类，为的是在页面能更精准显示错误提示信息
 * 
 * @author ZDST
 * @Date Aug 12, 2015 3:40:42 PM
 */
public class UserNoStateException extends AuthenticationException {

	private static final long serialVersionUID = 1L;

	public UserNoStateException() {
		super();
	}

	public UserNoStateException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNoStateException(String message) {
		super(message);
	}

	public UserNoStateException(Throwable cause) {
		super(cause);
	}
}
