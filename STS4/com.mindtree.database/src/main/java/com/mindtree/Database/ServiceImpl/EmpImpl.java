package com.mindtree.Database.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.Database.Entity.Department;
import com.mindtree.Database.Entity.Employee;
import com.mindtree.Database.Repository.DeptRepository;
import com.mindtree.Database.Repository.EmpRepository;
import com.mindtree.Database.Service.EmpService;

@Component
public class EmpImpl implements EmpService {

	@Autowired
	EmpRepository employeeRepo;
	@Autowired
	DeptRepository departmentRepo;

	@Override
	public Employee add(Employee emp) {
		return employeeRepo.save(emp);
	}

	@Override
	public ArrayList<Employee> list() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee addToDept(int dept_id, Employee emp) {
		Department department = departmentRepo.findById(dept_id);
		emp.setDepartment(department);
		employeeRepo.save(emp);
		return emp;
	}

}
