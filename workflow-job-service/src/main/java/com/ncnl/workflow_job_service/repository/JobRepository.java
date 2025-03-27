package com.ncnl.workflow_job_service.repository;

import com.ncnl.workflow_job_service.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<Job, UUID> {
}
