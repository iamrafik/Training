package com.mindtree.College.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.College.Entity.College;
import com.mindtree.College.Service.CollegeService;
import com.mindtree.College.StudentAndTemplate.RequestTemplate;

@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeService collegeService;

	@PostMapping
	public College add(@RequestBody College college) {
		return collegeService.add(college);
	}

	@GetMapping
	public List<College> list() {
		return collegeService.list();
	}

	@GetMapping("/{colId}")
	public College searchById(@PathVariable int colId) {
		return collegeService.searchById(colId);
	}

	@GetMapping("/all-college-student")
	public List<RequestTemplate> colListWithStudent() {
		return collegeService.colListWithStudent();
	}

	@GetMapping("/college-with-student/{colId}")
	public RequestTemplate specificColByStudent(@PathVariable int colId) {
		return collegeService.specificColByStudent(colId);
	}
}
