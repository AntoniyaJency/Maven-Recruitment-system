package com.example.demo.model;

public class Candidate {
    private int id;
    private String name;
    private String email;
    private int jobId;

    public Candidate() {}

    public Candidate(int id, String name, String email, int jobId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobId = jobId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getJobId() { return jobId; }
    public void setJobId(int jobId) { this.jobId = jobId; }
}
