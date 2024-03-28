package com.uu.studentservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uu.studentservice.models.Called;
import com.uu.studentservice.services.CalledService;

@RestController
@RequestMapping("/call")
public class CalledController {
    
    @Autowired
    CalledService callService;

    @PostMapping("/save")
    public void save(@RequestBody Called call) {
        callService.save(call);
    }

    @PutMapping("/update")
    public void update(@RequestBody Called call) {
        callService.update(call);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        callService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Called find(@PathVariable Long id) {
        return callService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Called> findAll() {
        return callService.findAll();
    }

    @GetMapping("/findByStudent/{id}")
    public List<Called> findByStudent(@PathVariable Long id) {
        return callService.findByStudent(id);
    }

    @GetMapping("/findOpenCalls")
    public List<Called> findOpenCalls() {
        return callService.findOpenCalls();
    }

    @GetMapping("/findInProgressCalls")
    public List<Called> findInProgressCalls() {
        return callService.findInProgressCalls();
    }

    @GetMapping("/findCompletedCalls")
    public List<Called> findCompletedCalls() {
        return callService.findCompletedCalls();
    }

    @GetMapping("/findByRequestType/{requestType}")
    public List<Called> findByRequestType(@PathVariable String requestType) {
        return callService.findByRequestType(requestType);
    }

}
