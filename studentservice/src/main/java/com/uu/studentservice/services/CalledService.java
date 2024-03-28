package com.uu.studentservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import com.uu.studentservice.interfaces.CalledRepository;
import com.uu.studentservice.interfaces.StudentClient;
import com.uu.studentservice.models.Called;

import jakarta.transaction.Transactional;

@Service
@EnableScheduling
@Transactional
public class CalledService {

    @Autowired
    CalledRepository callRepository;

    @Autowired
    StudentClient studentClient;

    public void save(Called call) {
        callRepository.save(call);
    }

    public void update(Called call) {
        callRepository.save(call);
    }

    public void deleteById(Long id) {
        callRepository.deleteById(id);
    }
    
    public Called findById(Long id) {
        return callRepository.findById(id).get();
    }

    public List<Called> findAll() {
        return callRepository.findAll();
    }

    public List<Called> findByStudent(Long id) {
        return callRepository.findByStudent(id);
    }

    public List<Called> findOpenCalls() {
        return callRepository.findOpenCalls();
    }

    public List<Called> findInProgressCalls() {
        return callRepository.findInProgressCalls();
    }

    public List<Called> findCompletedCalls() {
        return callRepository.findCompletedCalls();
    }

    public List<Called> findByRequestType(String requestType) {
        return callRepository.findByRequestType(requestType);
    }

}
