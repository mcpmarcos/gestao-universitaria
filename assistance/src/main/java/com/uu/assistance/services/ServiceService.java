package com.uu.assistance.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.uu.assistance.models.Service;
import com.uu.assistance.repositories.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    ServiceRepository serviceRepository;

public void save(Long id, String topic, String description, Date date){
    serviceRepository.save(id, topic, description, date);
}

public List<Service> findAll(){
    return serviceRepository.findAll();
}

public Optional<Service> findById(Long id){
    return serviceRepository.findById(id);
}

public void deleteById(Long id){
    serviceRepository.deleteById(id);
}

    
}
