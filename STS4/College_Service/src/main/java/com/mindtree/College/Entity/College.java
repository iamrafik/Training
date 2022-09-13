package com.mindtree.College.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int colId;
	private String colName;
	private int totalStudents;

	public College() {
	}

	public College(String colName, int totalStudents) {
		this.colName = colName;
		this.totalStudents = totalStudents;
	}

	public int getColId() {
		return colId;
	}

	public void setColId(int colId) {
		this.colId = colId;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

}
