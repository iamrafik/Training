package com.mindtree.user.Entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private long userId;
	private String userName;
	private String userPhone;

	List<Contact> contacts = new ArrayList<>();

	public User() {
	}

	public User(long userId, String userName, String userPhone, List<Contact> contacts) {
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.contacts = contacts;
	}

	public User(long userId, String userName, String userPhone) {
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
