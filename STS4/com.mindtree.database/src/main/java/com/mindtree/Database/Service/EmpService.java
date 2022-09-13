package com.mindtree.Database.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mindtree.Database.Entity.Employee;

@Service
public interface EmpService {
	Employee add(Employee emp);

	ArrayList<Employee> list();

	Employee addToDept(int dept_id, Employee emp);

}
