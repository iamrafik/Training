package com.mindtree.Department.EmpRegTemp;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.Department.Entity.Department;

public class RequestTemplate {
	private Department departmnt;
	private List<Employee> emplist = new ArrayList<Employee>();

	public RequestTemplate() {
		super();
	}

	public RequestTemplate(Department departmnt, List<Employee> emplist) {
		super();
		this.departmnt = departmnt;
		this.emplist = emplist;
	}

	public Department getDepartmnt() {
		return departmnt;
	}

	public void setDepartmnt(Department departmnt) {
		this.departmnt = departmnt;
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

}
