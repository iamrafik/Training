package com.mindtree.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Data.Entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	Employee findById(int Id);

}
