package com.mindtree.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Student.CollegeAndTemplate.ResponseTemplate;
import com.mindtree.Student.Entity.Student;
import com.mindtree.Student.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping
	public Student add(@RequestBody Student stu) {
		return studentService.add(stu);
	}

	@GetMapping
	public List<Student> listStudent() {
		return studentService.list();
	}

	@GetMapping("/{stuId}")
	public ResponseTemplate studentWithColl(@PathVariable int stuId) {
		return studentService.studentWithColl(stuId);
	}

	@PutMapping("/{stuId}/{colId}")
	public String updateCollege(@PathVariable int stuId, @PathVariable int colId) {
		Student stu = studentService.assignCollege(stuId, colId);
		if (stu != null) {
			return stu.toString();
		}
		return "You have enter wrong college or student";
	}

	@GetMapping("/student-with-ascname/{colId}")
	public List<Student> getByCollegeId(@PathVariable int colId) {
		return studentService.getByCollegeId(colId);
	}

	@GetMapping("/student-with-desc-age/{colId}")
	public List<Student> getStudentByCollegeWithDescAge(@PathVariable int colId) {
		return studentService.getStudentByCollegeWithDescAge(colId);
	}

}
