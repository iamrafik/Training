package com.mindtree.Employee.DepRegTmpl;

public class Department {
	private int deptId;
	private String deptName;
	private int noOfEmp;

	public Department() {
	}

	public Department(String deptName, int noOfEmp) {
		this.deptName = deptName;
		this.noOfEmp = noOfEmp;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getNoOfEmp() {
		return noOfEmp;
	}

	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}

}
