package com.shrey.jobtracker.controller;

import com.shrey.jobtracker.entity.JobApplication;
import com.shrey.jobtracker.service.JobApplicationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {

    @Autowired
    private JobApplicationService jobService;

    // Create a new job
    @PostMapping
    public JobApplication createJob(@Valid @RequestBody JobApplication job) {
        return jobService.saveJob(job);
    }

    // Get all jobs
    @GetMapping
    public List<JobApplication> getAllJobs() {
        return jobService.getAllJobs();
    }

    // Get a job by ID
    @GetMapping("/{id}")
    public JobApplication getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    // Update a job
    @PutMapping("/{id}")
    public JobApplication updateJob(@PathVariable Long id, @Valid @RequestBody JobApplication job) {
        job.setId(id);
        return jobService.updateJob(job);
    }

    // Delete a job
    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
    }
}
