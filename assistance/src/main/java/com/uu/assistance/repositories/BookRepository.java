package com.uu.assistance.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.assistance.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

@Modifying
@Query(value = "INSERT INTO book(id, title, author, amount) VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
void save(Long id, String title, String author, int amount);

@Query(value = "SELECT * FROM book ORDER BY title ASC", nativeQuery = true)
List<Book> findAll();

@Query(value = "SELECT EXISTS(SELECT 1 FROM link WHERE book_id = ?1)", nativeQuery = true)
Optional<Book> findById(Long id);

void deleteById(Long id);

}
