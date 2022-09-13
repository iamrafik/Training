package com.mindtree.Patient_Service.Controller;

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

import com.mindtree.Patient_Service.Entity.Patient;
import com.mindtree.Patient_Service.Service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin(value = "http://localhost:4200", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE })
public class PatientController {

	@Autowired
	PatientService patientService;

	@PostMapping
	public Patient add(@RequestBody Patient patn) {
		return patientService.add(patn);
	}

	@GetMapping
	public List<Patient> list() {
		return patientService.list();
	}

	@GetMapping("/{ptId}")
	public List<Patient> searchById(@PathVariable int ptId) {
		return patientService.searchById(ptId);
	}
}
