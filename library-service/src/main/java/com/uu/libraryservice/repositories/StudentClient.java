package com.uu.libraryservice.repositories;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "student-service", url = "http://localhost:8081")
public interface StudentClient {

    @GetMapping("/student/{id}")
    Map<String, Object> find(@PathVariable Long id);
    
}
