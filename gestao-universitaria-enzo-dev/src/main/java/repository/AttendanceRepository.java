package repository;

import jakarta.transaction.Transactional;
import model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
