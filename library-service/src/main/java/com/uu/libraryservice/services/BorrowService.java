package com.uu.libraryservice.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.libraryservice.models.Borrow;
import com.uu.libraryservice.repositories.BorrowRepository;

@Repository
public class BorrowService {
    
    @Autowired
    BorrowRepository borrowRepository;

    public void save(Long id, String topic, String description, Date date, List<Borrow>subjects){
        borrowRepository.save(id, topic, description, date, subjects);
    }

    public List<Borrow> findAll(){
        return borrowRepository.findAll();
    }

    public Optional<Borrow> findById(String id){
        return borrowRepository.findById(id);   
    }

    public void removeBookFromList(Borrow borrow){
        
     }

    public void deleteById(Long id){

    }

}
