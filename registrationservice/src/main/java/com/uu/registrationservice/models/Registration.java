package com.uu.registrationservice.models;

import com.uu.registrationservice.enums.RegistrationStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    private Long subjectId;
    private LocalDateTime registrationDate;
    private RegistrationStatus status;
}
