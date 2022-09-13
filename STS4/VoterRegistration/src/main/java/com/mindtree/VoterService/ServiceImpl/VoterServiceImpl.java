package com.mindtree.VoterService.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.VoterService.Entity.Voter;
import com.mindtree.VoterService.Repository.VoterRepository;
import com.mindtree.VoterService.Service.VoterService;

@Component
public class VoterServiceImpl implements VoterService {
	
	@Autowired
	VoterRepository voterRepository;

	@Override
	public Voter add(Voter voter) {
		return voterRepository.save(voter);
	}

	@Override
	public List<Voter> list() {
		return voterRepository.findAll();
	}

}
