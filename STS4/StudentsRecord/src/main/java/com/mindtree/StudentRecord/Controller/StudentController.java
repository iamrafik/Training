package com.mindtree.StudentRecord.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.StudentRecord.Entity.Student;
import com.mindtree.StudentRecord.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/get/all")
	public List<Student> getAll() {
		return studentService.getAll();
	}

	@PostMapping("/add")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@GetMapping("/get/{id}")
	public Student findStudentById(@PathVariable("id") int stuId, @RequestBody Student student) {
		return studentService.findStudentById(stuId);
	}

	@PutMapping("/update/{id}/{stuAge}")
	public Student updateStudentById(@PathVariable("id") int stuId, @PathVariable int stuAge) {
		return studentService.updateStudentById(stuId, stuAge);
	}
}