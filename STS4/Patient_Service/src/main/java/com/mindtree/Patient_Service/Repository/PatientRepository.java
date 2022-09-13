package com.mindtree.Patient_Service.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.Patient_Service.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{
	
	Patient findById(int ptId);
	
	@Query(value="select * from patient where pt_id like %:ptId%" ,nativeQuery = true)
	List<Patient> searchById(int ptId);

}
