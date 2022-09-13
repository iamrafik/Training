package com.mindtree.Hospital.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.Hospital.Entity.Hospital;
import com.mindtree.Hospital.doctorAndTemplate.RequestTemplate;

@Service
public interface HospitalService {
	Hospital add(Hospital hspl);

	List<Hospital> list();

	Hospital searchById(int hosId);

	List<RequestTemplate> listWithDoctor();

	RequestTemplate specificHospitaByDoctor(int hosId);

}
