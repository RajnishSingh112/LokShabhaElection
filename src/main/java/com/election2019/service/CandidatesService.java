package com.election2019.service;

import java.util.List;

import com.election2019.model.Candidates;


public interface CandidatesService {
	
	public List<Candidates> getCandidatesbyConstituencie(Long constituenciesId);
    public List<Candidates> getCandidatebyParties(Long partiesId);
    public List<Candidates>  getCandidatebyState(Long stateId);
    public void saveCandidate(Candidates candidate);
    public Candidates getCandidatesById(Long candidateId);

}
