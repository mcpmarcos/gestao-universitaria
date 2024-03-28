package com.uu.management.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uu.management.models.Course;
import com.uu.management.models.Subject;
import com.uu.management.repositories.SubjectRepository;

@Service
public class SubjectService {
    
    @Autowired
    SubjectRepository subjectRepository;
    public void save(Long id, String name, int workload, double grades[], int absences, boolean enrolled, List<Course> courses, Date entryDate){

    }

    public List<Subject> findAll(){
        return subjectRepository.findAll();
    }

    public Optional<Subject> findById (Long id){
        return subjectRepository.findById(id);
    }

    public void deleteById(Long id){
        subjectRepository.delete(null);
    }

}
