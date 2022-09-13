package com.mindtree.VoterService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Voter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vtId;
	private String vtName;
	private String vtgender;
	private String state;
	private String city;

	public Voter() {
	}

	public Voter(String vtName, String vtgender, String state, String city) {
		super();
		this.vtName = vtName;
		this.vtgender = vtgender;
		this.state = state;
		this.city = city;
	}

	public int getVtId() {
		return vtId;
	}

	public void setVtId(int vtId) {
		this.vtId = vtId;
	}

	public String getVtName() {
		return vtName;
	}

	public void setVtName(String vtName) {
		this.vtName = vtName;
	}

	public String getVtgender() {
		return vtgender;
	}

	public void setVtgender(String vtgender) {
		this.vtgender = vtgender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
