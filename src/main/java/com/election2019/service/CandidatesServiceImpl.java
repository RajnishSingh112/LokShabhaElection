package com.election2019.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.election2019.model.Candidates;
import com.election2019.model.Constituencies;
import com.election2019.model.Parties;
import com.election2019.model.States;
import com.election2019.repository.CandidatesRepository;
import com.election2019.repository.ConstituenciesRepository;
import com.election2019.repository.PartiesRepository;
import com.election2019.repository.StatesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CandidatesServiceImpl implements CandidatesService {
	
	
	@Autowired
	private CandidatesRepository candidateRepo;
	@Autowired
	private StatesRepository stateRepo ;
	@Autowired
	private ConstituenciesRepository constituenciesrepo; 
	@Autowired 
	private PartiesRepository partiesRepo ; 
	
	

	@Override
	public List<Candidates> getCandidatesbyConstituencie(Long constituenciesId) {
		Constituencies constituencies = constituenciesrepo.findById(constituenciesId).orElseThrow();
		return candidateRepo.findByConstituencies(constituencies);
	}
	

	@Override
	public List<Candidates> getCandidatebyParties(Long partiesId) {
		Parties parties = partiesRepo.findById(partiesId).orElseThrow();
		return candidateRepo.findByParties(parties);
	}


	@Override
	public List<Candidates> getCandidatebyState(Long statesId) {
		
		States states = stateRepo.findById(statesId).orElseThrow();
		
		return candidateRepo.findByStates(states);
	}


	@Override
	public void saveCandidate(Candidates candidate) {
		candidateRepo.save(candidate);
		
	}


	@Override
	public Candidates getCandidatesById(Long candidateId) {
		   
		return candidateRepo.findById(candidateId).orElseThrow();
	}

}
