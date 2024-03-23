package com.uu.management.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.management.models.Course;
import com.uu.management.models.CourseGrid;
import com.uu.management.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{


    @Modifying
    @Query(value = "INSERT INTO student( rm, nome, username, cpf, birth, courses, courseGrids) VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
    void save(String rm, String name, String username, String cpf, Date birth, List<Course> courses, List<CourseGrid> courseGrids);

    List<Student> findAll();

    Optional<Student> findByRm(String rm);

    void deleteByRm(String rm);

}
