package com.uu.courseservice.repository;

import com.uu.courseservice.models.Course;
import com.uu.courseservice.models.Subject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

  @Modifying
  @Query(value = "INSERT INTO subject (id, nome, teacher, workload, classroom) VALUES(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
  void save(Long id, String nome, String teacher, String classchedule, String classroom);

  @Query(value = "SELECT * FROM subject", nativeQuery = true)
  List<Course> findAllSubject();

}
  