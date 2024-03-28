package service;

import model.Attendance;
import model.request.AttendanceForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AttendanceRepository;

import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance addAttendance(AttendanceForm attendanceForm) {
        return attendanceRepository.save(new Attendance(attendanceForm.getStudentId(), attendanceForm.getCourseId(),
                attendanceForm.getDate(), attendanceForm.isPresent()));
    }

    public List<Attendance> listAttendances() {
        return attendanceRepository.findAll();
    }
}
