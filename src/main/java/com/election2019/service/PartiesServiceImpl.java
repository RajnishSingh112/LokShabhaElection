package com.election2019.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.election2019.model.Parties;

import com.election2019.repository.PartiesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PartiesServiceImpl implements PartiesService {
            
	 @Autowired
	 private PartiesRepository partyRepo;

//	@Override
//	public List<Parties> getpartiesByConstituencies(int constituenciesId) {
//		   
//		return partyRepo.findByConstituencies(constituenciesId); 
//	}

	@Override
	public List<Parties> getAllParties() {
		
		return partyRepo.findAll();
	}
	 
	

	

}
