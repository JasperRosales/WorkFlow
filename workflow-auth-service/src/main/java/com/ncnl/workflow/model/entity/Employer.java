package com.ncnl.workflow.model.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Use this model for addressing the employer site
 */
@Data
@Table(name = "employer_data")
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User {
    private String businessName;
    private String country;
    private String businessNumber;
}



