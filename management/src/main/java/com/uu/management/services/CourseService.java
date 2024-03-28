package com.uu.management.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uu.management.models.Course;
import com.uu.management.models.Student;
import com.uu.management.models.Subject;
import com.uu.management.repositories.CourseRepository;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public void save(String id, List<Student> students, List<Subject>subjects, Date entryDate){
        courseRepository.save(id, students, subjects, entryDate);
    }

    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    public Optional<Course> findById(String id){
        return courseRepository.findById(id);
    }

    public void deleteById(String id){
        courseRepository.deleteById(id);
    }

    
}