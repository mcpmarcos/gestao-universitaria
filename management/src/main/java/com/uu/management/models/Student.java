package com.uu.management.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    @Column(length = 10)
    @Nonnull
    private String rm;

    private String name;

    @Column(length = 20)
    private String username;

    @Nonnull
    @Column(length = 11)
    private String cpf;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birth;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<CourseGrid> courseGrids;
}

// String rm, name, username, cpf, Date birth, List<Course> courses, List<CourseGrid> courseGrid  