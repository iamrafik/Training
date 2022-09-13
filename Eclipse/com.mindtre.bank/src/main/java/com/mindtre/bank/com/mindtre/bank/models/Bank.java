package com.mindtre.bank.com.mindtre.bank.models;

public class Bank {

	private int id;
	private long accountNumber;
	private String name;
	private double balance;
	private String userName;
	private String password;
	
	public Bank() {
		
	}
	
	public Bank(long accountNumber, String name, double balance, String userName, String password) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.userName = userName;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
