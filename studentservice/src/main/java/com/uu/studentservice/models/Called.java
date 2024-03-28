package com.uu.studentservice.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.uu.studentservice.enums.Request;
import com.uu.studentservice.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Called {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Long studentId;

    public Request typeOfRequest;

    public String description;

    public Status status;

    @CreationTimestamp
    public LocalDateTime createdDate;
}
