package com.uu.management.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.uu.management.models.Course;

import com.uu.management.models.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{
    
        // Long id, String name, int workload, double grades[], int absences, boolean enrolled, List<Couse> courses, Date entryDate

    @Modifying
    @Query(value = "INSERT INTO subject(id, nome, workload, grades, absences, enrolled, curses, entryDate) VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)", nativeQuery = true)
    void save(Long id, String name, int workload, double grades[], int absences, boolean enrolled, List<Course> courses, Date entryDate);

    List<Subject> findAll();

    Optional<Subject> findById (Long id);

    void deleteById(Long id);

}
