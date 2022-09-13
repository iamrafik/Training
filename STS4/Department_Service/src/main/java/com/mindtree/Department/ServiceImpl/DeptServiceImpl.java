package com.mindtree.Department.ServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.Department.EmpRegTemp.Employee;
import com.mindtree.Department.EmpRegTemp.RequestTemplate;
import com.mindtree.Department.Entity.Department;
import com.mindtree.Department.Repository.DeptRepository;
import com.mindtree.Department.Service.DeptService;

@Component
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptRepository deptRepository;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Department add(Department department) {
		return deptRepository.save(department);
	}

	@Override
	public List<Department> list() {
		return deptRepository.findAll();
	}

	@Override
	public Department update(int id, String name) {
		Department department = deptRepository.findById(id);
		department.setDeptName(name);
		return deptRepository.save(department);
	}

	@Override
	public Department searchById(int id) {
		if (deptRepository.findById(id) == null) {
			return null;
		}
		return deptRepository.findById(id);
	}

	@Override
	public List<RequestTemplate> listWithEmployee() {
		List<RequestTemplate> totalList = new ArrayList<RequestTemplate>();
		List<Department> allDepartment = this.list();
		Iterator<Department> itr = allDepartment.iterator();
		while (itr.hasNext()) {
			Department department = itr.next();
			ResponseEntity<Employee> rsps = restTemplate.getForEntity("http://EMPLOYEE-SERVICE/employee/employee-by-ascname" + department.getDeptId(), Employee.class);
			Employee employee = rsps.getBody();
			List<Employee> employees = Arrays.asList(employee);
			RequestTemplate rqtpm = new RequestTemplate();
			rqtpm.setDepartmnt(department);
			rqtpm.setEmplist(employees);
			totalList.add(rqtpm);
		}
		return totalList;
	}

	@Override
	public RequestTemplate specificEmpByDept(int deptId) {
		Department dept = this.searchById(deptId);
		ResponseEntity<Employee> rspns = restTemplate.getForEntity("http://EMPLOYEE-SERVICE/employee/employee-by-desc-age" + dept.getDeptId(), Employee.class);
		Employee employee = rspns.getBody();
		List<Employee> empl = Arrays.asList(employee);
		RequestTemplate rqstmpl = new RequestTemplate();
		rqstmpl.setDepartmnt(dept);
		rqstmpl.setEmplist(empl);
		return rqstmpl;
	}

}
