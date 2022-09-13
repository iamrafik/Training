package com.mindtree.VoterService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.VoterService.Entity.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Integer> {

}
