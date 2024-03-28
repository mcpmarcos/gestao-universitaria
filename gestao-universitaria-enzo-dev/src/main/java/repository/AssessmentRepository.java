package repository;

import jakarta.transaction.Transactional;
import model.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
}
