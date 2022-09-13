package com.mindtree.Department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Department.Entity.Department;

@Repository
public interface DeptRepository extends JpaRepository<Department, Integer> {

	Department findById(int id);

}
