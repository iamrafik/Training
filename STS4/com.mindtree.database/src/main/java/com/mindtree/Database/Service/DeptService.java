package com.mindtree.Database.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mindtree.Database.Entity.Department;

@Service
public interface DeptService {
	Department add(Department dept);

	ArrayList<Department> list();

	ArrayList<Department> empListInDept();

}
