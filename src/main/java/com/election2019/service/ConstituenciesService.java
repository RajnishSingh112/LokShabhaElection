package com.election2019.service;

import java.util.List;

import com.election2019.model.Constituencies;

import com.election2019.model.States;

public interface ConstituenciesService {
  
	public List<Constituencies> getConstituenciesByState(Long stateId);
	

	
}
