package com.election2019.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.election2019.service.PartiesService;

@RestController
@RequestMapping("/parties")
@CrossOrigin("http://localhost:3000")
@Validated
public class PartiesController {
   @Autowired
   private PartiesService partiesService;
   
   public ResponseEntity<?> getAllParties(){
	   return ResponseEntity.ok(partiesService.getAllParties());
   }
}
