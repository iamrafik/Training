package com.mindtree.Employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.Employee.DepRegTmpl.ResponseTemplate;
import com.mindtree.Employee.Entity.Employee;

@Service
public interface EmpService {

	Employee add(Employee emp);

	List<Employee> list();

	ResponseTemplate empWithDepartment(int empId);

	Employee searchById(int id);

	Employee assignDept(int empId, int deptId);

	List<Employee> getByDeptId(int dept_Id);

	List<Employee> getEmpByDeptWithDescAge(int dept_id);

}
