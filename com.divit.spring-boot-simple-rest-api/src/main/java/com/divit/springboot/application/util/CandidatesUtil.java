package com.divit.springboot.application.util;

import java.util.List;
import java.util.Set;

import com.divit.springboot.application.model.Candidate;

public final class CandidatesUtil {

	private CandidatesUtil() {
	}

	/**
	 * 
	 * Method to help us get dummy data
	 * 
	 * @return list of candidates
	 */
	public static List<Candidate> getCandidates() {
		var candidateList = List.of(
				new Candidate("John", 2, Set.of("java", "c#", "c++", "golang")),
				new Candidate("David", 1, Set.of("javascript", "c++")),
				new Candidate("Diana", 4, Set.of("java", "python")),
				new Candidate("June", 2, Set.of("ruby", "aws", "docker")),
				new Candidate("April", 3, Set.of("python", "Erlang", "docker")));

		return candidateList;
	}
}
