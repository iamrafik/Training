package com.mindtree.Database.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private int NoOfEmp;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")

	private List<Employee> employee = new ArrayList<>();

	public Department() {
	}

	public Department(String name, List<Employee> employee) {
		this.name = name;
		this.employee = employee;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfEmp() {
		return NoOfEmp;
	}

	public void setNoOfEmp(int noOfEmp) {
		NoOfEmp = noOfEmp;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
