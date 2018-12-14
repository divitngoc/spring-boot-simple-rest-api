package com.divit.springboot.application.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
		List<Candidate> candidateList = new ArrayList<>();
		candidateList.add(new Candidate("John", 2, new HashSet<String>(Arrays.asList("java", "c#", "c++", "golang"))));
		candidateList.add(new Candidate("David", 1, new HashSet<String>(Arrays.asList("javaScript", "c++"))));
		candidateList.add(new Candidate("Diana", 4, new HashSet<String>(Arrays.asList("java", "python"))));
		candidateList.add(new Candidate("June", 2, new HashSet<String>(Arrays.asList("ruby", "aws", "docker"))));

		return candidateList;
	}
}
