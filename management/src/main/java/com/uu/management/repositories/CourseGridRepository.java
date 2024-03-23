package com.uu.management.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.management.enums.Shift;
import com.uu.management.models.Course;
import com.uu.management.models.CourseGrid;
import com.uu.management.models.Student;


@Repository
public interface CourseGridRepository extends JpaRepository<CourseGrid, Long>{

@Modifying
@Query(value = "INSERT INTO course_grid(id, student, course, totalWorkload, globalAverage, enrolled) VALUES(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
void save(Long id, Student student, Course course, int totalWorkload, double globalAverage, boolean enrolled, Shift shift);

@Query(value = "SELECT * FROM course_grid ORDER BY id ASC", nativeQuery = true)
List<CourseGrid> findAll();

@Query(value = "SELECT EXISTS(SELECT 1 FROM course_grid rid WHERE course_grid_id = ?1)", nativeQuery = true)
Optional<CourseGrid> findById(Long id);

void deleteById(Long id);

}
