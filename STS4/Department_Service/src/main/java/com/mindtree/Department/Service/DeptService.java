package com.mindtree.Department.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.Department.EmpRegTemp.RequestTemplate;
import com.mindtree.Department.Entity.Department;

@Service
public interface DeptService {
	Department add(Department department);

	List<Department> list();

	Department update(int id, String name);

	Department searchById(int id);

	List<RequestTemplate> listWithEmployee();

	RequestTemplate specificEmpByDept(int deptId);

}
