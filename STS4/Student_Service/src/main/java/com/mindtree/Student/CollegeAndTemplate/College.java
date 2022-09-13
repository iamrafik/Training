package com.mindtree.Student.CollegeAndTemplate;

public class College {
	private int colId;
	private String colName;
	private int totalStudents;

	public College() {
	}

	public College(int colId, String colName, int totalStudents) {
		this.colId = colId;
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
