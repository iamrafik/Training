package com.mindtree.DoctorService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long docId;
	private String docName;
	private int docAge;
	private String docGender;
	private String spclIn;
	private int noOfPtnAttnd;

	public Doctor() {
	}

	public Doctor(String docName, int docAge, String docGender, String spclIn, int noOfPtnAttnd) {
		super();
		this.docName = docName;
		this.docAge = docAge;
		this.docGender = docGender;
		this.spclIn = spclIn;
		this.noOfPtnAttnd = noOfPtnAttnd;
	}

	public long getDocId() {
		return docId;
	}

	public void setDocId(long docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public int getDocAge() {
		return docAge;
	}

	public void setDocAge(int docAge) {
		this.docAge = docAge;
	}

	public String getDocGender() {
		return docGender;
	}

	public void setDocGender(String docGender) {
		this.docGender = docGender;
	}

	public String getSpclIn() {
		return spclIn;
	}

	public void setSpclIn(String spclIn) {
		this.spclIn = spclIn;
	}

	public int getNoOfPtnAttnd() {
		return noOfPtnAttnd;
	}

	public void setNoOfPtnAttnd(int noOfPtnAttnd) {
		this.noOfPtnAttnd = noOfPtnAttnd;
	}

}