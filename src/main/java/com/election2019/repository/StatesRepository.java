package com.election2019.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.election2019.model.States;

public interface StatesRepository extends JpaRepository<States, Long> {
              
	
}
