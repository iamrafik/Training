package com.mindtree.Hospital.doctorAndTemplate;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.Hospital.Entity.Hospital;

public class RequestTemplate {
	private Hospital hospital;
	private List<Doctor> doctorList = new ArrayList<Doctor>();

	public RequestTemplate() {
	}

	public RequestTemplate(Hospital hospital, List<Doctor> doctorList) {
		super();
		this.hospital = hospital;
		this.doctorList = doctorList;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

}
