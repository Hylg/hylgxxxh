package com.hylg.xxxh.shiro.credentials;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

import com.hylg.xxxh.utils.CoreUtil;

/**
 * 自定义的密码验证及登陆次数限制
 * 
 * @author ZDST
 * @date Aug 21, 2015 10:40:19 AM
 */
public class MyHashedCredentialsMatcher extends HashedCredentialsMatcher {

//	private static final Logger LOG = LoggerFactory.getLogger(MyHashedCredentialsMatcher.class);
	
	/**
	 * 登陆次数限制,自定义密码验证
	 * 
	 * @date Aug 21, 2015 10:44:15 AM
	 * @param token
	 * @param info
	 * @return
	 */
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		// 判断用户名
		if (!super.doCredentialsMatch(token, info))
			return false;
		// 判断登录密码
		Object tokenCredentials = CoreUtil.toMD5((String) token.getCredentials());
		Object accountCredentials = info.getCredentials();
		return equals(tokenCredentials, accountCredentials);
	}

}
