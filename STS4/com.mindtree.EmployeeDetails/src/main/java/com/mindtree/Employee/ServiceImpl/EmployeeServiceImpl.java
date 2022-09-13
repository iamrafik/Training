package com.mindtree.Employee.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.Employee.Entity.Employee;
import com.mindtree.Employee.Repository.EmployeeRepository;
import com.mindtree.Employee.Service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository repository;

	@Override
	public List<Employee> getAll() {
		List<Employee> employee = repository.findAll();
		return employee;
	}

	@Override
	public Employee byId(int Id) {

		Employee emp = repository.findById(Id);
		return emp;
	}

	@Override
	public void add(Employee emp) {
		repository.save(emp);
	}

	public void update(Employee emp) {
		repository.save(emp);

	}

}
