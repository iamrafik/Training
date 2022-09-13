package com.mindtree.DoctorService.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.DoctorService.Entity.Doctor;
import com.mindtree.DoctorService.Repository.DoctorRepository;
import com.mindtree.DoctorService.Service.DoctorService;

@Component
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor add(Doctor doc) {
		return doctorRepository.save(doc);
	}

	@Override
	public List<Doctor> list() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor searchById(long docId) {
		if (doctorRepository.findById(docId) == null) {
			return null;
		}
		return doctorRepository.findById(docId);
	}

}
