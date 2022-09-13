package com.mindtree.Student.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.Student.CollegeAndTemplate.College;
import com.mindtree.Student.CollegeAndTemplate.ResponseTemplate;
import com.mindtree.Student.Entity.Student;
import com.mindtree.Student.Repository.StudentRepository;
import com.mindtree.Student.Service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Student add(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> list() {
		return studentRepository.findAll();
	}

	@Override
	public Student searchById(int stuId) {
		return studentRepository.findById(stuId);
	}

	@Override
	public ResponseTemplate studentWithColl(int stuId) {
		ResponseTemplate rsptm = new ResponseTemplate();
		Student stu = studentRepository.findById(stuId);
		College college = restTemplate.getForObject("http://COLLEGE-SERVICE/college/"+stu.getColId(), College.class);
		rsptm.setCollege(college);
		rsptm.setStudent(stu);
		return rsptm;
	}

	@Override
	public Student assignCollege(int stuId, int colId) {
		Student student = studentRepository.findById(stuId);
		College coll = restTemplate.getForObject("http://COLLEGE-SERVICE/college/"+colId, College.class);
		if (student == null || coll == null) {
			return null;
		}
		student.setColId(colId);
		studentRepository.save(student);
		return student;
	}

	@Override
	public List<Student> getByCollegeId(int colId) {
		return studentRepository.getByColId(colId);
	}

	@Override
	public List<Student> getStudentByCollegeWithDescAge(int colId) {
		return studentRepository.getStudentByCollegeWithDescAge(colId);
	}

}
