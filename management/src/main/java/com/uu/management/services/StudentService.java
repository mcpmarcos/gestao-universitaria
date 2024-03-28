package com.uu.management.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uu.management.models.Course;
import com.uu.management.models.CourseGrid;
import com.uu.management.models.Student;
import com.uu.management.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;

    public void save(String rm, String name, String username, String cpf, Date birth, List<Course> courses, List<CourseGrid> courseGrids){
        studentRepository.save(rm, name, username, cpf, birth, courses, courseGrids);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> findByRm(String rm){
        return studentRepository.findById(rm);
    }

    public void deleteByRm(String rm){
        studentRepository.deleteById(rm);;
    }

}
