package com.uu.studentservice.interfaces;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "") //TODO Add the name of the service
public interface StudentClient {
    
    @GetMapping("/students/{id}")
    Map<String, Object> find(@PathVariable Long id);
}
