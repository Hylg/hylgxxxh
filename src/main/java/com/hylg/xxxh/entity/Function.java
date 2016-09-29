package com.hylg.xxxh.entity;

/**
 * 功能类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午4:59:18
 */
public class Function {

	private String cmsFunctionId;

	private String cmsFunctionCode;// 功能标识

	private String cmsFunctionName;// 功能名称

	private Object data;// 其他关联数据

	public final String getCmsFunctionId() {
		return cmsFunctionId;
	}

	public final void setCmsFunctionId(String cmsFunctionId) {
		this.cmsFunctionId = cmsFunctionId;
	}

	public final String getCmsFunctionCode() {
		return cmsFunctionCode;
	}

	public final void setCmsFunctionCode(String cmsFunctionCode) {
		this.cmsFunctionCode = cmsFunctionCode;
	}

	public final String getCmsFunctionName() {
		return cmsFunctionName;
	}

	public final void setCmsFunctionName(String cmsFunctionName) {
		this.cmsFunctionName = cmsFunctionName;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}

}
