package com.mindtree.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Employee.DepRegTmpl.ResponseTemplate;
import com.mindtree.Employee.Entity.Employee;
import com.mindtree.Employee.Service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	EmpService empService;

	@PostMapping
	public Employee add(@RequestBody Employee emp) {
		return empService.add(emp);
	}

	@GetMapping
	public List<Employee> listEmp() {
		return empService.list();
	}

	@GetMapping("/{empId}")
	public ResponseTemplate empWithDepartment(@PathVariable int empId) {
		return empService.empWithDepartment(empId);
	}

	@PutMapping("/{empId}/{deptId}")
	public String updateDeptDtails(@PathVariable int empId, @PathVariable int deptId) {
		Employee employee = empService.assignDept(empId, deptId);
		if (employee != null) {
			return employee.toString();
		}
		return "You have entered a wrong department or employee";
	}

	@GetMapping("/employee-by-ascname/{dept_Id}")
	public List<Employee> getByDeptId(@PathVariable int dept_Id) {
		return empService.getByDeptId(dept_Id);
	}

	@GetMapping("/employee-by-desc-age/{dept_id}")
	public List<Employee> getEmpByDeptWithDescAge(@PathVariable int dept_id) {
		return empService.getEmpByDeptWithDescAge(dept_id);
	}

}
