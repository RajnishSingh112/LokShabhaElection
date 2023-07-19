package com.election2019.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Parties extends BaseEntity {
    
	@Column
	private String party_type;
	@Column
	private String abbreviation;
	@Column
	private String party_symbol;
	@Column
	private String party_name;
	
      @OneToMany(mappedBy="parties", cascade =CascadeType.ALL,orphanRemoval =true)
	  @JsonIgnore
	  private List<Candidates> candidates = new ArrayList<>();
}
