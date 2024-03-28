package controllers;

import model.PerformanceAlert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PerformanceAlertService;

import java.util.List;

@RestController
@RequestMapping("/performance-alert")
@Validated
public class PerformanceAlertController {

    @Autowired
    private PerformanceAlertService performanceAlertService;

    @GetMapping
    public ResponseEntity<List<PerformanceAlert>> listPerformanceAlerts() {
        List<PerformanceAlert> alerts = performanceAlertService.checkAcademicPerformance();
        return new ResponseEntity<>(alerts, HttpStatus.OK);
    }
}
