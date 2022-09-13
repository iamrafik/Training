package com.mindtree.Data.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_table")
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private double empSalary;

	public Employee() {
	}

	public Employee(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
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

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [Employee Id=" + empId + ", Employee Name=" + empName + ",Employee Salary" + empSalary + "]";
	}
}
