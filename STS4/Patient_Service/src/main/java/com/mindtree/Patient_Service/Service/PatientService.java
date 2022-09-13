package com.mindtree.Patient_Service.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.Patient_Service.Entity.Patient;

@Service
public interface PatientService {

	Patient add(Patient patn);

	List<Patient> list();

	List<Patient> searchById(int ptId);

}
