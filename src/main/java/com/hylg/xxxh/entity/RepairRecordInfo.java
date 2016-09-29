package com.hylg.xxxh.entity;

/**
 * 维修操作记录类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午5:03:50
 */
public class RepairRecordInfo {

	private String repairRecordInfoId;

	private String repairId;// 关联的维修单ID

	private String repairEvent;// 事件

	private String repairInfo;// 备注

	private String userId;// 操作人ID 关联的用户ID

	private String repairRecordCtime;// 记录创建时间

	private Object data;// 其他关联数据

	public final String getRepairRecordInfoId() {
		return repairRecordInfoId;
	}

	public final void setRepairRecordInfoId(String repairRecordInfoId) {
		this.repairRecordInfoId = repairRecordInfoId;
	}

	public final String getRepairId() {
		return repairId;
	}

	public final void setRepairId(String repairId) {
		this.repairId = repairId;
	}

	public final String getRepairEvent() {
		return repairEvent;
	}

	public final void setRepairEvent(String repairEvent) {
		this.repairEvent = repairEvent;
	}

	public final String getRepairInfo() {
		return repairInfo;
	}

	public final void setRepairInfo(String repairInfo) {
		this.repairInfo = repairInfo;
	}

	public final String getUserId() {
		return userId;
	}

	public final void setUserId(String userId) {
		this.userId = userId;
	}

	public final String getRepairRecordCtime() {
		return repairRecordCtime;
	}

	public final void setRepairRecordCtime(String repairRecordCtime) {
		this.repairRecordCtime = repairRecordCtime;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}
}
