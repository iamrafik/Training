package com.mindtree.Data.Service;

import java.util.List;

import com.mindtree.Data.Entity.Employee;

public interface EmployeeService {
	List<Employee> allEmployee();
	Employee EmpById(int Id);
	Boolean addEmp(Employee emp);
	String deleteEmp(int Id);
	String editEmp(Employee emp,int Id);

}
