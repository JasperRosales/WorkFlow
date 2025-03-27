package com.ncnl.workflow_job_service.sevice;

import com.ncnl.workflow_job_service.model.Job;
import com.ncnl.workflow_job_service.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public String createJobRequest(Job request){
        try{
            Job jobPost = new Job(
                    request.getTitle(),
                    request.getSubtitle(),
                    request.getOccupation(),
                    request.getRemote(),
                    request.getSalary(),
                    request.getDesc()
            );
            jobRepository.save(jobPost);

            return (jobPost.getJobId() != null)
                    ? "Job " + request.getTitle() + " is created successfully"
                    : "Failed to post " + request.getTitle();
        }catch (Exception e){
            return "Error creating job: " + e.getMessage();
        }
    }
}
