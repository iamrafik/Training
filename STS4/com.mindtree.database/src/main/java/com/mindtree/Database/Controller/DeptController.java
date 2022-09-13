package com.mindtree.Database.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Database.Entity.Department;
import com.mindtree.Database.Service.DeptService;

@RestController
@RequestMapping("/department")
public class DeptController {
	@Autowired
	DeptService deptService;

	@GetMapping("/get/all")
	public ArrayList<Department> list() {
		return deptService.list();
	}

	@PostMapping("/add")
	public Department add(@RequestBody Department dept) {
		return deptService.add(dept);
	}

	@GetMapping("/with-Emp")
	public ArrayList<Department> empListInDept() {
		return deptService.empListInDept();
	}
}
