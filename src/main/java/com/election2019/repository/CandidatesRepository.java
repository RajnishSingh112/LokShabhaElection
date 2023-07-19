package com.election2019.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.election2019.model.Candidates;
import com.election2019.model.Constituencies;
import com.election2019.model.Parties;
import com.election2019.model.States;

public interface CandidatesRepository extends JpaRepository<Candidates, Long> {
	
	
	
	public List<Candidates> findByStates(States states);
	
	public List<Candidates> findByConstituencies(Constituencies constituencies);
	
	public List<Candidates> findByParties(Parties parties);
	

}
