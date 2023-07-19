package com.election2019.service;

import java.util.List;

import com.election2019.model.States;
import com.election2019.repository.StatesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class StatesServiceImpl implements StatesService {
     
	private StatesRepository statesRepo;
	 
	@Override
	public List<States> getAllStates() {
		
		return statesRepo.findAll();
	}

}
