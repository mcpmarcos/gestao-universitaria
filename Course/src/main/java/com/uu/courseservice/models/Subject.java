package com.uu.courseservice.models;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String teacher;
    private String workload;
    private String classroom;

    @ManyToMany
    private List<Subject> preRequisitos;

    @ManyToMany(mappedBy = "preRequisitos")
    private List<Subject> coRequisitos;
}