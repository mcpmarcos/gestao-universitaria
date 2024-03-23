package com.uu.management.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.management.models.Course;
import com.uu.management.models.Student;
import com.uu.management.models.Subject;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{
    
@Modifying
@Query(value = "INSERT INTO course(id, students, subjects, entryDate) VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
void save(String id, List<Student> students, List<Subject>subjects, Date entryDate);

@Query(value = "SELECT * FROM course ORDER BY id ASC", nativeQuery = true)
List<Course> findAll();

@Query(value = "SELECT EXISTS(SELECT 1 FROM course WHERE course_id = ?1)", nativeQuery = true)
Optional<Course> findById(String id);

void deleteById(String id);
}
