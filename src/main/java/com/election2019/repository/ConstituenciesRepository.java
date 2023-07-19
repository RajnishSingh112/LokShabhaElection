package com.election2019.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.election2019.model.Constituencies;
import com.election2019.model.States;

public interface ConstituenciesRepository extends JpaRepository<Constituencies, Long> {
        
	public List<Constituencies> findByStates(States states);
}
