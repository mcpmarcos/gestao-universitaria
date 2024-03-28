package com.uu.registrationservice.interfaces;

import com.uu.registrationservice.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findByStudentId(Long studentId);

    List<Registration> findBySubjectId(Long subjectId);
}
