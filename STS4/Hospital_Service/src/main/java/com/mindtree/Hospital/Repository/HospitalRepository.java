package com.mindtree.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Hospital.Entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	
	Hospital findById(int hosId);

}
