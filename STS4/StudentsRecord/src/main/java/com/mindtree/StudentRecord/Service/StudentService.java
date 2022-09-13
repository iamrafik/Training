package com.mindtree.StudentRecord.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.StudentRecord.Entity.Student;
import com.mindtree.StudentRecord.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student findStudentById(int stuId) {
		return studentRepository.findStudentBystuId(stuId);
	}

	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Student updateStudentById(int stuId, int stuAge) {
		Student student = studentRepository.findStudentBystuId(stuId);
		student.setStuAge(stuAge);
		return studentRepository.save(student);
	}
}
