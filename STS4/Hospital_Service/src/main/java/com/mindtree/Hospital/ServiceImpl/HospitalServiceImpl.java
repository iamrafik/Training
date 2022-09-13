package com.mindtree.Hospital.ServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.Hospital.Entity.Hospital;
import com.mindtree.Hospital.Repository.HospitalRepository;
import com.mindtree.Hospital.Service.HospitalService;
import com.mindtree.Hospital.doctorAndTemplate.Doctor;
import com.mindtree.Hospital.doctorAndTemplate.RequestTemplate;

@Component
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	HospitalRepository hospitalRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Hospital add(Hospital hspl) {
		return hospitalRepository.save(hspl);
	}

	@Override
	public List<Hospital> list() {
		return hospitalRepository.findAll();
	}

	@Override
	public Hospital searchById(int hosId) {
		if (hospitalRepository.findById(hosId) == null) {
			return null;
		}
		return hospitalRepository.findById(hosId);
	}

	@Override
	public List<RequestTemplate> listWithDoctor() {
		List<RequestTemplate> wholeList = new ArrayList<RequestTemplate>();
		List<Hospital> allhospital = this.list();
		Iterator<Hospital> itr = allhospital.iterator();
		while (itr.hasNext()) {
			Hospital hpl = itr.next();
			ResponseEntity<Doctor> rspns = restTemplate.getForEntity("", Doctor.class);
			Doctor doctor = rspns.getBody();
			List<Doctor> drlist = Arrays.asList(doctor);
			RequestTemplate rqtm = new RequestTemplate();
			rqtm.setHospital(hpl);
			rqtm.setDoctorList(drlist);
			wholeList.add(rqtm);
		}
		return wholeList;
	}

	@Override
	public RequestTemplate specificHospitaByDoctor(int hosId) {
		Hospital hospital = this.searchById(hosId);

		ResponseEntity<Doctor> rsps = restTemplate.getForEntity("", Doctor.class);
		Doctor dr = rsps.getBody();
		List<Doctor> drsList = Arrays.asList(dr);
		RequestTemplate requestTemplate = new RequestTemplate();
		requestTemplate.setHospital(hospital);
		requestTemplate.setDoctorList(drsList);

		return requestTemplate;
	}

}
