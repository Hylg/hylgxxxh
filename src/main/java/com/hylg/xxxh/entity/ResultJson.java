package com.hylg.xxxh.entity;

/**
 * 返回值标准
 * 
 * @author Ruby
 * @datatime 2016年9月29日上午9:39:51
 */
public class ResultJson {

	private int code; // 标识

	private String msg; // 提示信息

	private Object data; // 数据源

	public final int getCode() {
		return code;
	}

	public final void setCode(int code) {
		this.code = code;
	}

	public final String getMsg() {
		return msg;
	}

	public final void setMsg(String msg) {
		this.msg = msg;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}

}
