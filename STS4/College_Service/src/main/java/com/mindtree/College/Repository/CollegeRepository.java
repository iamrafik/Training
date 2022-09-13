package com.mindtree.College.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.College.Entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

	College findById(int colId);

}
