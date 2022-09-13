package com.mindtree.Hospital.doctorAndTemplate;

public class Doctor {
	private int docId;
	private String docName;
	private String specialIn;
	private int experience;
	private int hosId;

	public Doctor() {
	}

	public Doctor(int docId, String docName, String specialIn, int experience, int hosId) {
		this.docName = docName;
		this.specialIn = specialIn;
		this.experience = experience;
		this.hosId = hosId;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getSpecialIn() {
		return specialIn;
	}

	public void setSpecialIn(String specialIn) {
		this.specialIn = specialIn;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getHosId() {
		return hosId;
	}

	public void setHosId(int hosId) {
		this.hosId = hosId;
	}

}
