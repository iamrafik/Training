package com.mindtree.Database.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.Database.Entity.Department;
import com.mindtree.Database.Repository.DeptRepository;
import com.mindtree.Database.Service.DeptService;

@Component
public class DeptImpl implements DeptService {
	@Autowired
	DeptRepository departmentRepo;

	@Override
	public Department add(Department dept) {
		return departmentRepo.save(dept);
	}

	@Override
	public ArrayList<Department> list() {
		return departmentRepo.findAll();
	}

	@Override
	public ArrayList<Department> empListInDept() {
		return departmentRepo.empListInDept();
	}

}
