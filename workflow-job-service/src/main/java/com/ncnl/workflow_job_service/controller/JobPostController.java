package com.ncnl.workflow_job_service.controller;

import com.ncnl.workflow_job_service.model.Job;
import com.ncnl.workflow_job_service.sevice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")
public class JobPostController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public String hello(){
        return "Hello from job post";
    }


    @PostMapping("/create-job")
    public ResponseEntity<String> jobCreationRequest(@RequestBody Job request){
        String response = jobService.createJobRequest(request);
        return ResponseEntity.ok(response);
    }

}
