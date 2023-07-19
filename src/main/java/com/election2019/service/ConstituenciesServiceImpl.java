package com.election2019.service;

import java.util.List;

import com.election2019.model.Constituencies;

import com.election2019.model.States;
import com.election2019.repository.ConstituenciesRepository;
import com.election2019.repository.StatesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ConstituenciesServiceImpl implements ConstituenciesService {
	@Autowired
	private ConstituenciesRepository constituenciesRepo;
	@Autowired
	private StatesRepository stateRepo ;

	@Override
	public List<Constituencies> getConstituenciesByState(Long stateId) {
		    States state = stateRepo.findById(stateId).orElseThrow();
		return constituenciesRepo.findByStates(state);
	}

	
     
	
	
}
