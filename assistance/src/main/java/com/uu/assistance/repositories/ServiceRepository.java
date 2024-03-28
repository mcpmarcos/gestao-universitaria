package com.uu.assistance.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.assistance.models.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>{

@Modifying
@Query(value = "INSERT INTO service(id, topic, description, date) VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
void save(Long id, String topic, String dscription, Date date);

@Query(value = "SELECT * FROM service ORDER BY id ASC", nativeQuery = true)
List<Service> findAll();

@Query(value = "SELECT EXISTS(SELECT 1 FROM link WHERE service_id = ?1)", nativeQuery = true)
Optional<Service> findById(Long id);

void deleteById(Long id);
    
}
