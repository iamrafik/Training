package com.mindtree.EmployeesServices;
import java.util.*;
import com.mindtree.Entity.Employees;
public interface EmployeesServices 
{
	void displayAllTheEmployeesRecord(ArrayList<Employees> empArr);
	void displayEmployeesByDescendingOrder(ArrayList<Employees> empArr);
	boolean updateEmployeeSalary(ArrayList<Employees> empArr,int empID);
}
