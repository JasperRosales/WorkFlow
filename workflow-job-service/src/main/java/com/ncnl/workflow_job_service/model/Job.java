package com.ncnl.workflow_job_service.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;


//TODO adjust this class with the following
// - reviews for job when posted
// - person or company who posted
// - details like pending, active, expired
// - expiration date

@Entity
@Table(name = "jobs")
public class Job {
    @Valid

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID jobId;

    @NotNull(message = "Title should have a value")
    private String title;

    @NotNull(message = "Subtitle should have a value")
    private String subtitle;

    @NotNull(message = "Occupation should have a value")
    private String occupation;

    @NotNull(message = "Work type should have a value")
    private String remote;

    @NotNull(message = "Please enter a valid salary")
    private String salary;

    @Column(name = "job_post_request_date")
    private LocalDateTime jobPostRequest;

    @Column(name = "job_post_published_date")
    private LocalDateTime jobPostPublished;

    @Column(name = "description")
    private String desc;

    public Job(String title, String subtitle, String occupation, String remote, String salary, String desc) {
        this.title = title;
        this.subtitle = subtitle;
        this.occupation = occupation;
        this.remote = remote;
        this.salary = salary;
        this.jobPostRequest = LocalDateTime.now();
        this.desc = desc;
    }

    public UUID getJobId() {
        return jobId;
    }

    public void setJobId(UUID jobId) {
        this.jobId = jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getJobPostPublished() {
        return jobPostPublished;
    }

    public void setJobPostPublished(LocalDateTime jobPostPublished) {
        this.jobPostPublished = jobPostPublished;
    }

    public LocalDateTime getJobPostRequest() {
        return jobPostRequest;
    }

}
