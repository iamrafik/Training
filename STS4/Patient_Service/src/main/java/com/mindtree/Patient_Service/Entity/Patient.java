package com.mindtree.Patient_Service.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ptId;
	private String ptName;
	private int ptAge;
	private String visitedDoctor;
	private String dateOfVisit;
	private String prescription;

	public Patient() {
	}

	public Patient(String ptName, int ptAge, String visitedDoctor, String dateOfVisit, String prescription) {
		super();
		this.ptName = ptName;
		this.ptAge = ptAge;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
		this.prescription = prescription;
	}

	public int getPtId() {
		return ptId;
	}

	public void setPtId(int ptId) {
		this.ptId = ptId;
	}

	public String getPtName() {
		return ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public int getPtAge() {
		return ptAge;
	}

	public void setPtAge(int ptAge) {
		this.ptAge = ptAge;
	}

	public String getVisitedDoctor() {
		return visitedDoctor;
	}

	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Patient [ptId=" + ptId + ", ptName=" + ptName + ", ptAge=" + ptAge + ", visitedDoctor=" + visitedDoctor
				+ ", dateOfVisit=" + dateOfVisit + ", prescription=" + prescription + "]";
	}

}
