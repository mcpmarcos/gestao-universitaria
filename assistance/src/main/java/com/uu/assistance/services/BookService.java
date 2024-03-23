package com.uu.assistance.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uu.assistance.models.Book;
import com.uu.assistance.repositories.BookRepository;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepository;
    
public void save(Long id, String title, String author, int amount){
    bookRepository.save(id, title, author, amount);
}

public List<Book> findAll(){
    return bookRepository.findAll();
}

public Optional<Book> findById(Long id){
    return bookRepository.findById(id);
}

public void deleteById(Long id){
    bookRepository.deleteById(id);
}
 

}
