package com.mindtree.Department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Department.EmpRegTemp.RequestTemplate;
import com.mindtree.Department.Entity.Department;
import com.mindtree.Department.Service.DeptService;

@RestController
@RequestMapping("/department")
public class DeptController {
	@Autowired
	private DeptService deptService;

	@PostMapping
	public Department add(@RequestBody Department department) {
		return deptService.add(department);
	}

	@GetMapping
	public List<Department> list() {
		return deptService.list();
	}

	@GetMapping("/{id}")
	public Department searchById(@PathVariable int id) {
		return deptService.searchById(id);
	}

	@GetMapping("/all-department-with-employee")
	public List<RequestTemplate> listWithEmployee() {
		return deptService.listWithEmployee();
	}

	@GetMapping("/specific-dept-with-employee/{deptId}")
	public RequestTemplate specificEmpByDept(@PathVariable int deptId) {
		return deptService.specificEmpByDept(deptId);
	}

}
