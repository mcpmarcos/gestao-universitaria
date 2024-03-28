package controllers;

import jakarta.validation.Valid;
import model.Assessment;
import model.request.AssessmentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import service.AssessmentService;

import java.util.List;

@RestController
@RequestMapping("/assessment")
@Validated
public class AssessmentController {

    @Autowired
    private AssessmentService assessmentService;

    @PostMapping
    public ResponseEntity<Assessment> addEvaluation(@RequestBody @Valid AssessmentForm evaluation) {

        Assessment newEvaluation = assessmentService.addAssessment(evaluation);

        return new ResponseEntity<>(newEvaluation, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Assessment>> listEvaluations() {

        List<Assessment> evaluations = assessmentService.listAssessments();

        return new ResponseEntity<>(evaluations, HttpStatus.OK);
    }
}
