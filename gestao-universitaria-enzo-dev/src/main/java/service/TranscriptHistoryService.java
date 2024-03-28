package service;

import model.AcademicHistory;
import model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranscriptHistoryService {

    @Autowired
    private AssessmentService evaluationService;

    @Autowired
    private AttendanceService attendanceService;

    public List<Transcript> generateTranscripts() {
        /*implementar*/
        return null;
    }

    public List<AcademicHistory> generateHistories() {
        /*implementar*/
        return null;
    }
}
