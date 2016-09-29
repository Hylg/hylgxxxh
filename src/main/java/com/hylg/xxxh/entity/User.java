package com.hylg.xxxh.entity;

/**
 * 用户类
 * 
 * @author Ruby
 * @datatime 2016年9月29日上午9:48:07
 */
public class User {

	private String userId;

	private String userName;// 名称

	private String userSex;// 性别

	private String userPhone;// 手机号码

	private String userEmail;// 电子邮箱

	private String userState;// 状态

	private String userVip;// VIP等级

	private String userImage;// 头像存储地址

	private String userCtime;// 注册时间

	public final String getUserId() {
		return userId;
	}

	public final void setUserId(String userId) {
		this.userId = userId;
	}

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}

	public final String getUserSex() {
		return userSex;
	}

	public final void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public final String getUserPhone() {
		return userPhone;
	}

	public final void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public final String getUserEmail() {
		return userEmail;
	}

	public final void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public final String getUserState() {
		return userState;
	}

	public final void setUserState(String userState) {
		this.userState = userState;
	}

	public final String getUserVip() {
		return userVip;
	}

	public final void setUserVip(String userVip) {
		this.userVip = userVip;
	}

	public final String getUserImage() {
		return userImage;
	}

	public final void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public final String getUserCtime() {
		return userCtime;
	}

	public final void setUserCtime(String userCtime) {
		this.userCtime = userCtime;
	}

}
