package com.mindtree.Employee.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.Employee.DepRegTmpl.Department;
import com.mindtree.Employee.DepRegTmpl.ResponseTemplate;
import com.mindtree.Employee.Entity.Employee;
import com.mindtree.Employee.Repository.EmpRepository;
import com.mindtree.Employee.Service.EmpService;
@Component
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepository;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Employee add(Employee emp) {
		return empRepository.save(emp);
	}

	@Override
	public List<Employee> list() {
		return empRepository.findAll();
	}

	@Override
	public ResponseTemplate empWithDepartment(int empId) {
		ResponseTemplate rspt = new ResponseTemplate();
		Employee employee = empRepository.findById(empId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + employee.getDeptId(), Department.class);
		rspt.setDepartment(department);
		rspt.setEmployee(employee);
		return rspt;
	}

	@Override
	public Employee searchById(int id) {
		return empRepository.findById(id);
	}

	@Override
	public Employee assignDept(int empId, int deptId) {
		Employee employee = empRepository.findById(empId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + deptId, Department.class);
		if (department == null || employee == null) {
			return null;
		}
		employee.setDeptId(deptId);
		empRepository.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getByDeptId(int dept_Id) {
		return empRepository.getByDeptId(dept_Id);
	}

	@Override
	public List<Employee> getEmpByDeptWithDescAge(int dept_id) {
		return empRepository.getEmpByDeptWithDescAge(dept_id);
	}

}
