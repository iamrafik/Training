package com.mindtree.customerEntity;

public class Customers 
{
	private int cusID;
	private String cusName;
	private int cusAge;
	
	public int getCusID() 
	{
		return cusID;
	}
	public void setCusID(int cusID) 
	{
		this.cusID = cusID;
	}
	public String getCusName() 
	{
		return cusName;
	}
	public void setCusName(String cusName) 
	{
		this.cusName = cusName;
	}
	public int getCusAge() 
	{
		return cusAge;
	}
	public void setCusAge(int cusAge) 
	{
		this.cusAge = cusAge;
	}
	public Customers() {}
	public Customers(int cusID,String cusName,int cusAge)
	{
		this.cusID=cusID;
		this.cusName=cusName;
		this.cusAge=cusAge;
	}
}
