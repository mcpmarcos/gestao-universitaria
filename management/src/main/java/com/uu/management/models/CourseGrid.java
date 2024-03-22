package com.uu.management.models;

import com.uu.management.enums.Shift;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CourseGrid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_rm", nullable = false)
    private Student student;

    private Course course;

    private int totalWorkload;

    private double globalAverage;

    private boolean enrolled;

    private Shift shift;
}
