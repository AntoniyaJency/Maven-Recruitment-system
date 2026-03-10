package com.example.demo.controller;

import com.example.demo.model.Candidate;
import com.example.demo.service.CandidateService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/candidates")
@CrossOrigin(origins = "*")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    //this is comment

    @PostMapping
    public void addCandidate(@RequestBody Candidate candidate) {
        candidateService.addCandidate(candidate);
    }
}
