package service;

import model.Assessment;
import model.request.AssessmentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AssessmentRepository;

import java.util.List;

@Service
public class AssessmentService {

    @Autowired
    private AssessmentRepository evaluationRepository;

    public Assessment addAssessment(AssessmentForm assessmentForm) {
        return evaluationRepository.save(new Assessment(assessmentForm.getStudentId(), assessmentForm.getCourseId(),
                assessmentForm.getGrade(), assessmentForm.getDate()));
    }

    public List<Assessment> listAssessments() {
        return evaluationRepository.findAll();
    }
}
