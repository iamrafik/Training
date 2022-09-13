package com.mindtree.College.StudentAndTemplate;

public class Student {
	private int stuId;
	private String stuName;
	private String stuGender;
	private int stuAge;
	private String stuStream;
	private int colId;

	public Student() {
	}

	public Student(String stuName, String stuGender, int stuAge, String stuStream, int colId) {
		super();
		this.stuName = stuName;
		this.stuGender = stuGender;
		this.stuAge = stuAge;
		this.stuStream = stuStream;
		this.colId = colId;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuStream() {
		return stuStream;
	}

	public void setStuStream(String stuStream) {
		this.stuStream = stuStream;
	}

	public int getColId() {
		return colId;
	}

	public void setColId(int colId) {
		this.colId = colId;
	}

}
