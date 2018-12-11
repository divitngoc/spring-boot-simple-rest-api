package com.divit.springboot.application.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.divit.springboot.application.model.Candidate;
import com.divit.srpingboot.application.util.CandidatesUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1")
public class ApiRestController {

	@GetMapping(value = "/candidates")
	public ResponseEntity<?> fetchCandidates(@RequestParam(value = "skill", required = false) String skill) {
		log.info("Response received. Params: skills {}", skill);

		// Simple util to help us get some dummy data
		List<Candidate> candidateList = CandidatesUtil.getCandidates();
		if (!StringUtils.isEmpty(skill)) {
			// Filtering by skill
			candidateList.removeIf((candidate) -> !candidate.getSkillsSet().contains(skill.toLowerCase()));
		}

		return ResponseEntity.ok(candidateList);
	}

}
