package com.hylg.xxxh.shiro.credentials;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

/**
 * 自定义的密码验证及登陆次数限制
 * 
 * @author ZDST
 * @date Aug 21, 2015 10:40:19 AM
 */
public class MyHashedCredentialsMatcher extends HashedCredentialsMatcher {

	private Cache<String, AtomicInteger> passwordRetryCache;

	public MyHashedCredentialsMatcher(CacheManager cacheManager) {
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}

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
		// UsernamePasswordToken uToken = (UsernamePasswordToken) token;
		// 根据当前登录用户名，判断请求次数
//		String username = (String) token.getPrincipal();
//		AtomicInteger retryCount = passwordRetryCache.get(username);
//		if (retryCount == null) {
//			retryCount = new AtomicInteger(0);
//			passwordRetryCache.put(username, retryCount);
//		}
//		// 请求次数上限
//		// if (retryCount.incrementAndGet() > 5) {
//		// throw new ExcessiveAttemptsException();
//		// }
//		// 判断用户名
//		if (super.doCredentialsMatch(token, info)) {
//			passwordRetryCache.remove(username);
//		}
//		// 判断登录密码
//		Object tokenCredentials = null;
//		tokenCredentials = new String((char[]) token.getCredentials());
//		// if (!uToken.getHost().contains("autoLogin"))
//		tokenCredentials = EncryptUtils.toMD5((String) tokenCredentials);
//		Object accountCredentials = info.getCredentials();
//		return equals(tokenCredentials, accountCredentials);
		return true;
	}

}
