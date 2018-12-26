package com.divit.springboot.application.model;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Candidate {
	private String name;
	private int experienceYears;
	private Set<String> skillsSet;

	public Candidate(String name, int experienceYears, Set<String> skillsSet) {
		this.name = name;
		this.experienceYears = experienceYears;
		this.skillsSet = skillsSet;
	}

}
