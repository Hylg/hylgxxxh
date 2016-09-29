package com.hylg.xxxh.entity;

/**
 * 维修类型类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午5:01:07
 */
public class RepairType {

	private String repairTypeId;

	private String repairTypeName;// 类型名称

	private Object data;// 其他关联数据

	public final String getRepairTypeId() {
		return repairTypeId;
	}

	public final void setRepairTypeId(String repairTypeId) {
		this.repairTypeId = repairTypeId;
	}

	public final String getRepairTypeName() {
		return repairTypeName;
	}

	public final void setRepairTypeName(String repairTypeName) {
		this.repairTypeName = repairTypeName;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}

}
