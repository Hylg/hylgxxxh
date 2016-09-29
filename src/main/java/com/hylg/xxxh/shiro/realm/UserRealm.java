package com.hylg.xxxh.shiro.realm;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Shiro自定义Realm类
 * 
 * @author LiaoJiahong
 *
 */
public class UserRealm extends AuthorizingRealm {

	// 权限缓存
	private Map<String, SimpleAuthorizationInfo> userCache = new LinkedHashMap<String, SimpleAuthorizationInfo>();

	/**
	 * 登入认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//		String loginName = (String) token.getPrincipal();
//		List<Object> list = usersService.selectUsers(loginName);
//		if (list.size() < 1)
//			throw new UnknownAccountException();
//		Users user = (Users) list.get(0);
//		if (user.getState().equals(null))
//			throw new AuthenticationException();
//		else if (user.getState().equals("0"))
//			throw new UserInvalidStateException();
//		else if (user.getState().equals("-1"))
//			throw new UserNoStateException();
//		SimpleAuthenticationInfo authenticationinfo = new SimpleAuthenticationInfo(user.getLoginName(), user.getPwd(),
//				getName());
//		return authenticationinfo;
		return null;
	}

	/**
	 * 权限检查
	 */
	@Override
	public boolean isPermitted(PrincipalCollection principals, Permission permission) {
//		// 用户授权对象
//		SimpleAuthorizationInfo authorizationInfo = null;
//		// 得到用户名
//		String loginName = principals.getPrimaryPrincipal().toString();
//		// 获取缓存中的用户权限对象
//		authorizationInfo = userCache.get(loginName);
//		if (authorizationInfo == null)
//			authorizationInfo = (SimpleAuthorizationInfo) getAuthorizationInfo(principals);
//		else {
//			// 获取最新角色/权限数量
//			int rolesCount = rolesManaService.selectRolesCount(loginName);
//			int perCount = rolesManaService.selectPermissionsCount(loginName);
//			if (authorizationInfo.getRoles().size() != rolesCount
//					|| authorizationInfo.getStringPermissions().size() != perCount)
//				authorizationInfo = (SimpleAuthorizationInfo) getAuthorizationInfo(principals);
//		}
//		return permissionAuthorizer.isPermission(authorizationInfo.getStringPermissions(), principals, permission);
		return true;
	}

	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		// 用户名
//		String loginName = (String) principals.getPrimaryPrincipal();
//		// 创建用户授权对象
//		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//		// 授予角色
//		authorizationInfo.setRoles(rolesManaService.selectRoleName(loginName));
//		// 数据库取用户权限并授权
//		authorizationInfo.setStringPermissions(rolesManaService.selectPermissionsUrl(loginName));
//		// 缓存用户授权对象
//		userCache.put(loginName, authorizationInfo);
//		return authorizationInfo;
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
