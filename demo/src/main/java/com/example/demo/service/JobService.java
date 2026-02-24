package com.example.demo.service;

import com.example.demo.model.Job;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    private List<Job> jobs = new ArrayList<>();

    public JobService() {
        jobs.add(new Job(1, "Java Developer", "Looking for a Java Developer with 2+ years experience"));
        jobs.add(new Job(2, "Frontend Developer", "Looking for React/Angular Developer"));
        jobs.add(new Job(3, "Data Analyst", "Looking for a Data Analyst familiar with SQL & Python"));
    }

    public List<Job> getAllJobs() {
        return jobs;
    }

    public Job getJobById(int id) {
        return jobs.stream().filter(j -> j.getId() == id).findFirst().orElse(null);
    }
}
