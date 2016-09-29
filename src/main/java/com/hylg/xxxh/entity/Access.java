package com.hylg.xxxh.entity;

/**
 * 账户类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午4:44:24
 */
public class Access {

	private String accessId;

	private String accessToken;// 令牌

	private String accessKey;// 密匙

	private String accessState;// 状态 1/0

	private String userId;// 关联的用户ID

	private String accessTypeId;// 关联的账户类型ID

	private String accessCtime;// 创建时间

	private Object data;// 其他关联数据

	public final String getAccessId() {
		return accessId;
	}

	public final void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public final String getAccessToken() {
		return accessToken;
	}

	public final void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public final String getAccessKey() {
		return accessKey;
	}

	public final void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public final String getAccessState() {
		return accessState;
	}

	public final void setAccessState(String accessState) {
		this.accessState = accessState;
	}

	public final String getUserId() {
		return userId;
	}

	public final void setUserId(String userId) {
		this.userId = userId;
	}

	public final String getAccessTypeId() {
		return accessTypeId;
	}

	public final void setAccessTypeId(String accessTypeId) {
		this.accessTypeId = accessTypeId;
	}

	public final String getAccessCtime() {
		return accessCtime;
	}

	public final void setAccessCtime(String accessCtime) {
		this.accessCtime = accessCtime;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}

}
