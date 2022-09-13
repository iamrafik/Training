package com.mindtree.DoctorService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.DoctorService.Entity.Doctor;
import com.mindtree.DoctorService.Service.DoctorService;

@RestController
@RequestMapping(value = "/doctor")
@CrossOrigin(value="http://localhost:4200", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.DELETE})
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping
	public Doctor add(@RequestBody Doctor doc) {
		return doctorService.add(doc);
	}

	@GetMapping
	public List<Doctor> getAllDoctor() {
		return doctorService.list();
	}

	@GetMapping("/{docId}")
	public Doctor searchById(@PathVariable long docId) {
		return doctorService.searchById(docId);
	}

}

