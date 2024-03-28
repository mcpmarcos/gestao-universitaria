package com.uu.libraryservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uu.libraryservice.models.Book;
import com.uu.libraryservice.models.Borrow;
import com.uu.libraryservice.repositories.BookRepository;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepository;

    public void save(Long id, String title, String author, Integer amount, Borrow borrow){
        bookRepository.save(id, title, author, amount, borrow);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);   
    }

    public void deleteById(Long id){

    }

}
