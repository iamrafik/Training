package com.mindtree.Data.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Data.Entity.Employee;
import com.mindtree.Data.Service.EmployeeService;

@RestController
public class Controller {
	@Autowired
	EmployeeService empService;

	@GetMapping("/get/all")
	public List<Employee> allEmployee() {
		return empService.allEmployee();
	}

	@GetMapping("/get/{Id}")
	public Employee getById(@PathVariable int Id) {
		return empService.EmpById(Id);
	}

	@PostMapping("/add")
	public String addEmp(@RequestBody Employee emp) {
		boolean val = empService.addEmp(emp);
		if (!val) {
			return "Something went wrong";
		}
		return emp.toString();
	}

	@DeleteMapping("/delete")
	public String deleteEmp(@RequestParam int Id) {
		return empService.deleteEmp(Id);
	}

	@PutMapping("/update/{Id}")
	public String updateEmp(@RequestBody Employee emp, @PathVariable int Id) {
		return empService.editEmp(emp, Id);
	}

}
