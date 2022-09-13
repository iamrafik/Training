package com.mindtree.Students.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mindtree.Students.entity.Student;
import com.mindtree.Students.repository.StuRepository;

@RestController
public class StuController {
	
	@Autowired
	StuRepository stuService;
	
	@GetMapping("/get/all")
	public ArrayList<Student> getAll(){
		return stuService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Student getById(@PathVariable int id)
	{
		return stuService.byId(id);
	}
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student stu)
	{
		stuService.add(stu);
		return stu;
	}
}
