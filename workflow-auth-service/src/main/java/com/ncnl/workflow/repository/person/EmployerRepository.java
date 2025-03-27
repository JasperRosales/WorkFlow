package com.ncnl.workflow.repository.person;

import com.ncnl.workflow.model.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmployerRepository extends JpaRepository<Employer, UUID>{

    Optional<Employer> findById(UUID id);
    Optional<Employer> findByBusinessName(String businessName);
}
