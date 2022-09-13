package com.mindtree.Database.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.Database.Entity.Department;

@Repository
public interface DeptRepository extends JpaRepository<Department, Integer> {
	Department findById(int dept_Id);

	ArrayList<Department> findAll();

	@Query(value = "SELECT e.* FROM employee e RIGHT JOIN department d ON e.department_id=d.id GROUP BY d.id ORDER BY e.name DESC", nativeQuery = true)
	ArrayList<Department> empListInDept();

}
