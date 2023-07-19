package com.election2019.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Constituencies extends BaseEntity {
  
  @Column
  private String constituencies;
  
  @ManyToOne
  @JoinColumn(name="stateID")
  @JsonIgnore
  private States states;
	
  @OneToMany(mappedBy="constituencies", cascade =CascadeType.ALL,orphanRemoval =true)
  @JsonIgnore
  private List<Candidates> candidates = new ArrayList<>();
	
}
