package com.hylg.xxxh.entity;

/**
 * 角色类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午4:50:17
 */
public class Role {

	private String cmsRoleId;

	private String cmsRoleName;// 角色名称

	private Object data;// 其他关联数据

	public final String getCmsRoleId() {
		return cmsRoleId;
	}

	public final void setCmsRoleId(String cmsRoleId) {
		this.cmsRoleId = cmsRoleId;
	}

	public final String getCmsRoleName() {
		return cmsRoleName;
	}

	public final void setCmsRoleName(String cmsRoleName) {
		this.cmsRoleName = cmsRoleName;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}
}
