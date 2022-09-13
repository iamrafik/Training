package com.mindtree.Patient_Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.Patient_Service.Entity.Patient;
import com.mindtree.Patient_Service.Repository.PatientRepository;
import com.mindtree.Patient_Service.Service.PatientService;

@Component
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Patient add(Patient patn) {
		return patientRepository.save(patn);
	}

	@Override
	public List<Patient> list() {
		return patientRepository.findAll();
	}

	@Override
	public List<Patient> searchById(int ptId) {
		return patientRepository.searchById(ptId);
	}

}
