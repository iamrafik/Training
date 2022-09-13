package com.mindtree.Database.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Database.Entity.Employee;
import com.mindtree.Database.Service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	EmpService empService;

	@GetMapping("/get/all")
	public ArrayList<Employee> list() {
		return empService.list();
	}

	@PostMapping("/add")
	public Employee add(@RequestBody Employee emp) {
		return empService.add(emp);
	}

	@PostMapping("/get/{id}")
	public Employee addToDept(@RequestBody Employee emp, @PathVariable int id) {
		return empService.addToDept(id, emp);
	}

}
