package com.mindtree.Employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mindtree.Employee.Entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	Employee findById(int id);

	@Query(value = "SELECT*FROM employee WHERE dept_Id=dept_Id ORDER BY name ASC", nativeQuery = true)
	List<Employee> getByDeptId(@Param("dept_Id") int dept_Id);

	@Query(value = "SELECT*FROM employee WHERE dept_id=dept_id ORDER BY age DESC", nativeQuery = true)
	List<Employee> getEmpByDeptWithDescAge(@Param("dept_id") int dept_id);

}
