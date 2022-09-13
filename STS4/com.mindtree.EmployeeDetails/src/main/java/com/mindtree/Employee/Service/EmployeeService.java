package com.mindtree.Employee.Service;


import java.util.List;

import org.springframework.stereotype.Service;
import com.mindtree.Employee.Entity.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getAll();

	Employee byId(int Id);

	void add(Employee emp);

}
