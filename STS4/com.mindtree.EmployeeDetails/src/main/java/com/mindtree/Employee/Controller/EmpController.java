package com.mindtree.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Employee.Entity.Employee;
import com.mindtree.Employee.ServiceImpl.EmployeeServiceImpl;

@RestController
public class EmpController {

	@Autowired
	EmployeeServiceImpl empService;

	@GetMapping("/get/all")
	public List<Employee> getAll() {
		return empService.getAll();
	}

	@GetMapping("/get/{Id}")
	public Employee getById(@PathVariable int Id) {
		return empService.byId(Id);
	}

	@PostMapping("/add")
	public Employee addemp(@RequestBody Employee emp) {
		empService.add(emp);
		return emp;
	}

	@PutMapping("/update")
	public Employee updateSalaray(@RequestBody Employee emp) {
		empService.update(emp);
		return emp;
	}

}
