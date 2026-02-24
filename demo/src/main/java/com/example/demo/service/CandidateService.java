package com.example.demo.service;

import com.example.demo.model.Candidate;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {

    private List<Candidate> candidates = new ArrayList<>();

    public List<Candidate> getAllCandidates() {
        return candidates;
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }
}
