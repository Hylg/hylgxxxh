package com.hylg.xxxh.entity;

/**
 * 账户类型类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午4:47:40
 */
public class AccessType {

	private String accessTypeId;

	private String accessTypeName;// 类型名称

	private Object data;// 其他关联数据

	public final String getAccessTypeId() {
		return accessTypeId;
	}

	public final void setAccessTypeId(String accessTypeId) {
		this.accessTypeId = accessTypeId;
	}

	public final String getAccessTypeName() {
		return accessTypeName;
	}

	public final void setAccessTypeName(String accessTypeName) {
		this.accessTypeName = accessTypeName;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}

}
