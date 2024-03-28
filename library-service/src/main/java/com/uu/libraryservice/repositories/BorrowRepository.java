package com.uu.libraryservice.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.security.auth.Subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.libraryservice.models.Borrow;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Long>{
    
    @Modifying
    @Query(value = "INSERT INTO borrow (id, topic, description, date, books) VALUES(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    void save(Long id, String topic, String description, Date date, List<Borrow>subjects);

    @Query(value = "SELECT * FROM borrow ORDER BY id ASC", nativeQuery = true)
    List<Borrow> findAll();

    @Query(value = "SELECT EXISTS(SELECT 1 FROM borrow WHERE borrow_id = ?1)", nativeQuery = true)
    Optional<Borrow> findById(String id);

    void deleteById(Long id);

    //@Query(value = Escrever query para deletar um livro da lista de livros que está de FK em Borrrow)
    //void removeBookFromList(Borrow borrow);
}
