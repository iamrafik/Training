package com.mindtree.Entity;

public class Employees 
{
	private int empID;
	private String empName;
	private int empAge;
	private int empSalary;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Employees() {}
	public Employees(int empID,String empName,int empAge,int empSalary)
	{
		this.empID=empID;
		this.empName=empName;
		this.empAge=empAge;
		this.empSalary=empSalary;
	}

}
