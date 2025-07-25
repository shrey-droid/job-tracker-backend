package com.shrey.jobtracker.service;

import com.shrey.jobtracker.entity.JobApplication;
import com.shrey.jobtracker.exception.JobNotFoundException;
import com.shrey.jobtracker.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobRepository;

    // Create a new job application
    public JobApplication saveJob(JobApplication job) {
        return jobRepository.save(job);
    }

    // Get all job applications
    public List<JobApplication> getAllJobs() {
        return jobRepository.findAll();
    }

    // Get a job by ID
    public JobApplication getJobById(Long id) {
        return jobRepository.findById(id)
                .orElseThrow(() -> new JobNotFoundException("Job with ID " + id + " not found"));
    }

    // Update job
    public JobApplication updateJob(JobApplication job) {
        return jobRepository.save(job);
    }

    // Delete job
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
