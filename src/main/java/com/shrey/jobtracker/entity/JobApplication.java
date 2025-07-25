package com.shrey.jobtracker.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_application")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Position is required")
    @Size(min = 2, max = 100, message = "Position must be between 2 and 100 characters")
    private String position;

    @NotBlank(message = "Company is required")
    private String company;

    @NotBlank(message = "Status is required")
    private String status;

    @PastOrPresent(message = "Applied date cannot be in the future")
    @Column(name = "applied_date")
    private LocalDate appliedDate;

    @Size(max = 500, message = "Notes must be less than 500 characters")
    private String notes;
}

