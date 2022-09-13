package com.mindtree.Database.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private double empSalary;
	private int empAge;
	private String empGen;
	@ManyToOne
	@JsonIgnore
	private Department department;

	public Employee() {
	}

	public Employee(String empName, double empSalary, int empAge,String empGen) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge= empAge;
		this.setEmpGen(empGen);
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

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpGen() {
		return empGen;
	}

	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ ", empGen=" + empGen + ", department=" + department + "]";
	}

	

}
