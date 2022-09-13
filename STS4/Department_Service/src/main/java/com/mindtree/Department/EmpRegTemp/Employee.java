package com.mindtree.Department.EmpRegTemp;

public class Employee {
	private int empId;
	private String empName;
	private String empGender;
	private int empAge;
	private double empSalary;
	private int deptId;

	public Employee() {
	}

	public Employee(String empName, String empGender, int empAge, double empSalary, int deptId) {
		this.empName = empName;
		this.empGender = empGender;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
