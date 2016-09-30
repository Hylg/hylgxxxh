package com.hylg.xxxh.shiro.realm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hylg.xxxh.entity.Access;
import com.hylg.xxxh.exception.UserNoStateException;
import com.hylg.xxxh.service.UserService;
import com.hylg.xxxh.utils.CoreUtil;

/**
 * Shiro自定义Realm类
 * 
 * @author LiaoJiahong
 *
 */
public class UserRealm extends AuthorizingRealm {

	private static final Logger LOG = LoggerFactory.getLogger(UserRealm.class);

	// 权限缓存
	private Map<String, SimpleAuthorizationInfo> userCache = new LinkedHashMap<String, SimpleAuthorizationInfo>();

	@Autowired
	private UserService userService;

	/**
	 * 登入认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		Map<String, Object> map = new HashMap<String, Object>(1);
		String loginName = (String) token.getPrincipal();
		map.put("aToken", loginName);
		LOG.debug("["+CoreUtil.getSysDateTime()+"]　"+loginName+"　用户请求了服务器");
		List<Access> list = userService.findAccess(map);
		if (list.size() < 1)
			throw new UnknownAccountException();
		Access user = list.get(0);
		// 判断账户状态
		if (user.getAccessState().equals(null))
			throw new AuthenticationException();
		else if (user.getAccessState().equals("0"))
			throw new UserNoStateException();
		// 返回账户信息
		SimpleAuthenticationInfo authenticationinfo = new SimpleAuthenticationInfo(user.getAccessToken(),
				user.getAccessKey(), getName());
		return authenticationinfo;
	}

	/**
	 * 权限检查
	 */
	@Override
	public boolean isPermitted(PrincipalCollection principals, Permission permission) {
		// // 用户授权对象
		// SimpleAuthorizationInfo authorizationInfo = null;
		// // 得到用户名
		// String loginName = principals.getPrimaryPrincipal().toString();
		// // 获取缓存中的用户权限对象
		// authorizationInfo = userCache.get(loginName);
		// if (authorizationInfo == null)
		// authorizationInfo = (SimpleAuthorizationInfo)
		// getAuthorizationInfo(principals);
		// else {
		// // 获取最新角色/权限数量
		// int rolesCount = rolesManaService.selectRolesCount(loginName);
		// int perCount = rolesManaService.selectPermissionsCount(loginName);
		// if (authorizationInfo.getRoles().size() != rolesCount
		// || authorizationInfo.getStringPermissions().size() != perCount)
		// authorizationInfo = (SimpleAuthorizationInfo)
		// getAuthorizationInfo(principals);
		// }
		// return
		// permissionAuthorizer.isPermission(authorizationInfo.getStringPermissions(),
		// principals, permission);
		return false;
	}

	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// // 用户名
		// String loginName = (String) principals.getPrimaryPrincipal();
		// // 创建用户授权对象
		// SimpleAuthorizationInfo authorizationInfo = new
		// SimpleAuthorizationInfo();
		// // 授予角色
		// authorizationInfo.setRoles(rolesManaService.selectRoleName(loginName));
		// // 数据库取用户权限并授权
		// authorizationInfo.setStringPermissions(rolesManaService.selectPermissionsUrl(loginName));
		// // 缓存用户授权对象
		// userCache.put(loginName, authorizationInfo);
		// return authorizationInfo;
		return null;
	}

	// -------------------------------清除缓存-------------------------------------------

	@Override
	public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
		super.clearCachedAuthorizationInfo(principals);
	}

	@Override
	public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
		super.clearCachedAuthenticationInfo(principals);
	}

	@Override
	public void clearCache(PrincipalCollection principals) {
		String loginName = (String) principals.getPrimaryPrincipal();
		if (userCache.get(loginName) != null)
			userCache.remove(loginName);
		super.clearCache(principals);
	}

	public void clearAllCachedAuthorizationInfo() {
		getAuthorizationCache().clear();
	}

	public void clearAllCachedAuthenticationInfo() {
		getAuthenticationCache().clear();
	}

	public void clearAllCache() {
		clearAllCachedAuthenticationInfo();
		clearAllCachedAuthorizationInfo();
	}
}
