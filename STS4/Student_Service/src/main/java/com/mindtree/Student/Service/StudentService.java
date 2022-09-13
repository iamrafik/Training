package com.mindtree.Student.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.Student.CollegeAndTemplate.ResponseTemplate;
import com.mindtree.Student.Entity.Student;

@Service
public interface StudentService {

	Student add(Student student);

	List<Student> list();

	Student searchById(int stuId);

	ResponseTemplate studentWithColl(int stuId);

	Student assignCollege(int stuId, int colId);

	List<Student> getByCollegeId(int colId);

	List<Student> getStudentByCollegeWithDescAge(int colId);

}
