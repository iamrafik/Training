package com.mindtree.VoterService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.VoterService.Entity.Voter;

@Service
public interface VoterService {
	Voter add(Voter voter);

	List<Voter> list();

}
