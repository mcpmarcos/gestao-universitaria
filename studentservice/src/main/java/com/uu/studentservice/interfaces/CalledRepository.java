package com.uu.studentservice.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uu.studentservice.models.Called;

@Repository
public interface CalledRepository extends JpaRepository<Called, Long> {
    
    @Query(value = "SELECT * FROM call WHERE student_id = ?1", nativeQuery = true)
    List<Called> findByStudent(Long id);

    @Query(value = "SELECT * FROM call WHERE status = 'OPEN'", nativeQuery = true)
    List<Called> findOpenCalls();

    @Query(value = "SELECT * FROM call WHERE status = 'IN_PROGRESS'", nativeQuery = true)
    List<Called> findInProgressCalls();

    @Query(value = "SELECT * FROM call WHERE status = 'COMPLETED'", nativeQuery = true)
    List<Called> findCompletedCalls();

    @Query(value = "SELECT * FROM call WHERE type_of_request = ?1", nativeQuery = true)
    List<Called> findByRequestType(String requestType);

}
