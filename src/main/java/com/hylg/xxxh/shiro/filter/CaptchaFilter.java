package com.hylg.xxxh.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hylg.xxxh.entity.CaptchaToken;
import com.hylg.xxxh.exception.IncorrectCaptchaException;
import com.hylg.xxxh.utils.ResultCoreUtil;

/**
 * 扩展 FormAuthenticationFilter 类
 * 
 * 验证码校验类
 * 
 * @author ZDST
 * @Date Aug 12, 2015 3:46:47 PM
 */
public class CaptchaFilter extends FormAuthenticationFilter {

//	private static final Logger LOG = LoggerFactory.getLogger(CaptchaFilter.class);

	public CaptchaFilter() {
	}

	/**
	 * 登录验证
	 */
	@Override
	protected boolean executeLogin(ServletRequest request1, ServletResponse response) throws Exception {
		HttpServletRequest request = (HttpServletRequest) request1;
		CaptchaToken token = createToken(request1, response);
		try {
			/* 图形验证码验证 */
			doCaptchaValidate(request, token);
			Subject subject = SecurityUtils.getSubject();
			subject.login(token);// 正常验证
			return onLoginSuccess(token, subject, request, response);
		} catch (AuthenticationException e) {
			return onLoginFailure(token, e, request, response);
		}
	}

	// 验证码校验
	protected void doCaptchaValidate(HttpServletRequest request, CaptchaToken token) {
		// session中的图形码字符串
		HttpSession session = request.getSession();
		String captcha = (String) session.getAttribute(ResultCoreUtil.IMAGE_CODE);
		// 比对
		if (captcha != null && !captcha.equalsIgnoreCase(token.getCaptcha()))
			throw new IncorrectCaptchaException();
	}

	@Override
	protected CaptchaToken createToken(ServletRequest request, ServletResponse response) {
		String username = getUsername(request);
		String password = getPassword(request);
		boolean rememberMe = isRememberMe(request);
		String host = getHost(request);
		String captcha = getCaptcha(request);
		return new CaptchaToken(username, password.toCharArray(), rememberMe, host, captcha);
	}

	public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

	private String captchaParam = DEFAULT_CAPTCHA_PARAM;

	public String getCaptchaParam() {
		return captchaParam;
	}

	public void setCaptchaParam(String captchaParam) {
		this.captchaParam = captchaParam;
	}

	protected String getCaptcha(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCaptchaParam());
	}

	// 保存异常对象到request
	@Override
	protected void setFailureAttribute(ServletRequest request, AuthenticationException ae) {
		request.setAttribute(getFailureKeyAttribute(), ae);
	}
}
