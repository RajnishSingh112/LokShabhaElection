package com.election2019.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.election2019.service.ConstituenciesService;

@RestController
@RequestMapping("/Constituencies")
@CrossOrigin("http://localhost:3000")
@Validated
public class ConstituenciesController {
    @Autowired
	private ConstituenciesService constituenciesService;
     
	@GetMapping("/ConstState/{statesId}")
	public ResponseEntity<?> getAllConstituencies(@PathVariable Long statesId){
		return ResponseEntity.ok(constituenciesService.getConstituenciesByState(statesId));
	}

}
