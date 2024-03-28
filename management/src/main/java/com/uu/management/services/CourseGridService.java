package com.uu.management.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uu.management.enums.Shift;
import com.uu.management.models.Course;
import com.uu.management.models.CourseGrid;
import com.uu.management.models.Student;
import com.uu.management.repositories.CourseGridRepository;


@Service
public class CourseGridService {
    
    @Autowired
    CourseGridRepository courseGridRepository;

    public void save(Long id, Student student, Course course, int totalWorkload, double globalAverage, boolean enrolled, Shift shift){
        courseGridRepository.save(id, student , course, totalWorkload, globalAverage, enrolled, shift);
    }

    public List<CourseGrid> findAll(){
        return courseGridRepository.findAll();
    }

    public Optional<CourseGrid> findById(Long id){
        return courseGridRepository.findById(id);
    }

    public void deleteById(Long id){
        courseGridRepository.deleteById(id);;
    }
}
