package com.thinkconstructive.userserviceone;

public class User {
	
	private String userId;
	private String userName;
	private String userPhoneNumber;
	private Profile profile;
	
	public User() {}

	public User(String userId, String userName, String userPhoneNumber) {
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
