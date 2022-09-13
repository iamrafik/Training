package com.mindtree.Details.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.Details.Entity.Department;
import com.mindtree.Details.Repository.DeptRepository;

@Service
public class DeptService {
	@Autowired
	private DeptRepository deptRepository;

	public Department saveDepartment(Department department) {
		return deptRepository.save(department);
	}

	public Department findDepartmentById(int deptId) {
		return deptRepository.findByDepartmentId(deptId);
	}

}
