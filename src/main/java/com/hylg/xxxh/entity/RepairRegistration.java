package com.hylg.xxxh.entity;

/**
 * 维修登记类
 * 
 * @author Ruby
 * @datatime 2016年9月29日下午5:06:44
 */
public class RepairRegistration {

	private String repairId;

	private String repairAddress;// 维修地点

	private String repairTypeId;// 关联的维修类型ID

	private String repairEquName;// 设备名称

	private String repairState;// 状态 0:待审核/1:未通过/2:待受理/3:受理中/4:已维修/5:报废

	private String repairMoney;// 费用

	private String repairName;// 报修人姓名

	private String repairPhone;// 报修人联系方式

	private String repairMsg;// 报修详情

	private String repairFault;// 故障情况 0:新故障/1:旧故障

	private String repairLevel;// 报修等级 1:一般/2:紧急/3:特急

	private String repairCtime;// 报修事件

	private Object data;// 其他关联

	public final String getRepairId() {
		return repairId;
	}

	public final void setRepairId(String repairId) {
		this.repairId = repairId;
	}

	public final String getRepairAddress() {
		return repairAddress;
	}

	public final void setRepairAddress(String repairAddress) {
		this.repairAddress = repairAddress;
	}

	public final String getRepairTypeId() {
		return repairTypeId;
	}

	public final void setRepairTypeId(String repairTypeId) {
		this.repairTypeId = repairTypeId;
	}

	public final String getRepairEquName() {
		return repairEquName;
	}

	public final void setRepairEquName(String repairEquName) {
		this.repairEquName = repairEquName;
	}

	public final String getRepairState() {
		return repairState;
	}

	public final void setRepairState(String repairState) {
		this.repairState = repairState;
	}

	public final String getRepairMoney() {
		return repairMoney;
	}

	public final void setRepairMoney(String repairMoney) {
		this.repairMoney = repairMoney;
	}

	public final String getRepairName() {
		return repairName;
	}

	public final void setRepairName(String repairName) {
		this.repairName = repairName;
	}

	public final String getRepairPhone() {
		return repairPhone;
	}

	public final void setRepairPhone(String repairPhone) {
		this.repairPhone = repairPhone;
	}

	public final String getRepairMsg() {
		return repairMsg;
	}

	public final void setRepairMsg(String repairMsg) {
		this.repairMsg = repairMsg;
	}

	public final String getRepairFault() {
		return repairFault;
	}

	public final void setRepairFault(String repairFault) {
		this.repairFault = repairFault;
	}

	public final String getRepairLevel() {
		return repairLevel;
	}

	public final void setRepairLevel(String repairLevel) {
		this.repairLevel = repairLevel;
	}

	public final String getRepairCtime() {
		return repairCtime;
	}

	public final void setRepairCtime(String repairCtime) {
		this.repairCtime = repairCtime;
	}

	public final Object getData() {
		return data;
	}

	public final void setData(Object data) {
		this.data = data;
	}
}
