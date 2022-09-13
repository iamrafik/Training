package com.mindtree.Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Details.Entity.Department;

@Repository
public interface DeptRepository extends JpaRepository<Department, Integer>{

	Department findByDepartmentId(int deptId);

}
