package com.election2019.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class States extends BaseEntity {
     
    @Column(name="states")	
	private String states;
	
    @OneToMany(mappedBy="states",cascade =CascadeType.ALL,orphanRemoval =true)
    @JsonIgnore
    private List<User> user = new ArrayList<>();
    
    @OneToMany(mappedBy="states", cascade =CascadeType.ALL,orphanRemoval =true)
    @JsonIgnore
    private List<Constituencies> constituencies = new ArrayList<>();
    
    @OneToMany(mappedBy="states", cascade =CascadeType.ALL,orphanRemoval =true)
    @JsonIgnore
    private List<Candidates> candidates = new ArrayList<>();
    
}
