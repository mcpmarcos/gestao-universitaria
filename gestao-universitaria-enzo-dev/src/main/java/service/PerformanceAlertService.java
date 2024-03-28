package service;

import model.PerformanceAlert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformanceAlertService {

    @Autowired
    private AssessmentService assessmentService;

    @Autowired
    private AttendanceService attendanceService;

    public List<PerformanceAlert> checkAcademicPerformance() {

        /*implementar*/
        return null;
    }
}
