package com.election2019.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.election2019.model.Candidates;
import com.election2019.service.CandidatesService;

@RestController
@RequestMapping("/Candidate")
@Validated
@CrossOrigin("http://localhost:3000")
public class CandidatesController {
   
	@Autowired
	private CandidatesService candidateService ;
	
	@GetMapping("/candState/{stateId}")
    public ResponseEntity<List<Candidates>> getAllCandidatesByState(@PathVariable Long stateId){
    	 return ResponseEntity.ok(candidateService.getCandidatebyState(stateId));
    }
	
	@GetMapping("/{candidateId}")
	public ResponseEntity<?>  getCandidateById(@PathVariable Long candidateId){
		return ResponseEntity.ok(candidateService.getCandidatesById(candidateId));
	}
	
	@GetMapping("/candConstituencies/{constituencieId}")
	public ResponseEntity<?> getCandidateByConstituencies(@PathVariable Long constituencieId){
		return ResponseEntity.ok(candidateService.getCandidatesbyConstituencie(constituencieId));
	}
	
	@GetMapping("/candParty/{partyId}")
	public ResponseEntity<?> getCandidateByParty(@PathVariable Long partyId){
		return ResponseEntity.ok(candidateService.getCandidatebyParties(partyId));
	}
	
	
	
	
	
}
