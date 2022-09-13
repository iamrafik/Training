package com.mindtree.DoctorService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DoctorService.Entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	Doctor findById(long docId);

}