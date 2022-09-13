package com.mindtree.Hospital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hosId;
	private String hosName;
	private String hosLocation;

	public Hospital() {
	}

	public Hospital(String hosName, String hosLocation) {
		this.hosName = hosName;
		this.hosLocation = hosLocation;
	}

	public int getHosId() {
		return hosId;
	}

	public void setHosId(int hosId) {
		this.hosId = hosId;
	}

	public String getHosName() {
		return hosName;
	}

	public void setHosName(String hosName) {
		this.hosName = hosName;
	}

	public String getHosLocation() {
		return hosLocation;
	}

	public void setHosLocation(String hosLocation) {
		this.hosLocation = hosLocation;
	}

}
