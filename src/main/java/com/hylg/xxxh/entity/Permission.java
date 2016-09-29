package com.hylg.xxxh.entity;

/**
 * 权限类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午4:54:44
 */
public class Permission {
	private String cmsPermissionId;

	private String cmsRoleId;// 关联的角色ID

	private String cmsFunctionId;// 关联的功能ID

	private String cmsSet;// 修改权限 1/0

	private String cmsGet;// 读取权限 1/0

	private String cmsCtime;// 创建时间

	private Object data;// 其他关联数据

	public final String getCmsPermissionId() {
		return cmsPermissionId;
	}

	public final void setCmsPermissionId(String cmsPermissionId) {
		this.cmsPermissionId = cmsPermissionId;
	}

	public final String getCmsRoleId() {
		return cmsRoleId;
	}

	public final void setCmsRoleId(String cmsRoleId) {
		this.cmsRoleId = cmsRoleId;
	}

	public final String getCmsFunctionId() {
		return cmsFunctionId;
	}

	public final void setCmsFunctionId(String cmsFunctionId) {
		this.cmsFunctionId = cmsFunctionId;
	}

	public final String getCmsSet() {
		return cmsSet;
	}

	public final void setCmsSet(String cmsSet) {
		this.cmsSet = cmsSet;
	}

	public final String getCmsGet() {
		return cmsGet;
	}

	public final void setCmsGet(String cmsGet) {
		this.cmsGet = cmsGet;
	}

	public final String getCmsCtime() {
		return cmsCtime;
	}

	public final void setCmsCtime(String cmsCtime) {
		this.cmsCtime = cmsCtime;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}

}
