package com.uu.libraryservice.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.libraryservice.models.Book;
import com.uu.libraryservice.models.Borrow;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

    @Modifying
    @Query(value = "INSERT INTO book (id, title, author, amount, borrow ) VALUES(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    void save(Long id, String title, String author, Integer amount, Borrow borrow);

    @Query(value = "SELECT * FROM borrow ORDER BY id ASC", nativeQuery = true)
    List<Book> findAll();

    @Query(value = "SELECT EXISTS(SELECT 1 FROM book WHERE book_id = ?1)", nativeQuery = true)
    Optional<Borrow> findById(String id);

    void deleteById(Long id);

}
