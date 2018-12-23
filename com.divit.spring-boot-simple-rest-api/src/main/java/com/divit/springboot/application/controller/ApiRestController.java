package com.divit.springboot.application.controller;

import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.divit.springboot.application.util.CandidatesUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1")
public class ApiRestController {

	@GetMapping(value = "/candidates")
	public ResponseEntity<?> fetchCandidates(@RequestParam(value = "skill", required = false) String skill) {
		log.info("Response received. Params: skill {}", skill);

		// Simple util to help us get some dummy data
		var candidateList = CandidatesUtil.getCandidates();
		if (!StringUtils.isEmpty(skill)) {
			// Filter by skill
			return ResponseEntity.ok(candidateList.stream()
							.filter(candidate -> candidate.getSkillsSet().contains(skill.toLowerCase()))
							.collect(Collectors.toList()));
		}

		return ResponseEntity.ok(candidateList);
	}

}
