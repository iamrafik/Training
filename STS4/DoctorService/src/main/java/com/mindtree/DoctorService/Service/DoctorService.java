package com.mindtree.DoctorService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.DoctorService.Entity.Doctor;

@Service
public interface DoctorService {

	Doctor add(Doctor doc);

	List<Doctor> list();

	Doctor searchById(long docId);

	

}