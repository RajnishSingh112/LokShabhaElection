package com.election2019.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.election2019.model.Parties;

public interface PartiesRepository extends JpaRepository<Parties, Long> {
	
//	@Query("SELECT p FROM Candidate c LEFT JOIN c.party p WHERE c.constituencies_Id = :constituenciesId")
//	List<Parties> findByConstituencies(int constituenciesId);
	
}
