package com.uu.courseservice.repository;

import java.util.List;
import com.uu.enums.Period;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.courseservice.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

  @Modifying
  @Query(value = "INSERT INTO subject (id, name, period) VALUES(?1, ?2, ?3)", nativeQuery = true)
  void save(Long id, String name, Period period);

  @Query(value = "SELECT * FROM course", nativeQuery = true)
  List<Course> findAllCourses();

}
