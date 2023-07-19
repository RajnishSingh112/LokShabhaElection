package com.election2019.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Candidates extends BaseEntity {
    @Column
	private String candidates_name;
    @Column
	private String sex;
    @Column
	private Integer age;
    @Column
	private String category;
    @Column
	private Long general_votes;
    @Column
	private Long postal_votes;
    @Column
    private Long total_votes;
    @Column
	private float percentage;
    @Column
	private Long total_voters;
    
    @ManyToOne
    @JoinColumn(name="state_id")
    @JsonIgnore
    private States states;
    @ManyToOne
    @JoinColumn(name="constituencies_id")
    @JsonIgnore
    private Constituencies constituencies;
    @ManyToOne
    @JoinColumn(name="party_id")
    @JsonIgnore
    private Parties parties;
	
}
