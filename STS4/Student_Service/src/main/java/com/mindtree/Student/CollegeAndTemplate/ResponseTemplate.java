package com.mindtree.Student.CollegeAndTemplate;

import com.mindtree.Student.Entity.Student;

public class ResponseTemplate {
	private Student student;
	private College college;

	public ResponseTemplate() {
	}

	public ResponseTemplate(Student student, College college) {
		this.student = student;
		this.college = college;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

}
