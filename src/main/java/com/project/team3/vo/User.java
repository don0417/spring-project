package com.project.team3.vo;

public class User {
	public String userId;
	public String userPw;
	public String userName;
	public String userNickname;
	public String userEmail;

	public User(String userId, String userPw, String userName, String userNickname, String userEmail) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userNickname = userNickname;
		this.userEmail = userEmail;
	}
	
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = "";
		this.userNickname = "";
		this.userEmail = "";

	}

	public User() {
		this.userId = "";
		this.userPw = "";
		this.userName = "";
		this.userNickname = "";
		this.userEmail = "";

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userNickname="
				+ userNickname + ", userEmail=" + userEmail + "]";
	}

}