package com.mindtree.Database.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Database.Entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	ArrayList<Employee> findAll();

}
