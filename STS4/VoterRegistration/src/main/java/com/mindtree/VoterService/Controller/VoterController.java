package com.mindtree.VoterService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.VoterService.Entity.Voter;
import com.mindtree.VoterService.Service.VoterService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/voter")
public class VoterController {

	@Autowired
	VoterService voterService;

	@PostMapping
	public Voter add(@RequestBody Voter voter) {
		return voterService.add(voter);
	}

	@GetMapping
	public List<Voter> list() {
		return voterService.list();
	}

}
