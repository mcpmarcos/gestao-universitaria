package controllers;

import jakarta.validation.Valid;
import model.Attendance;
import model.request.AttendanceForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import service.AttendanceService;

import java.util.List;

@RestController
@RequestMapping("/attendance")
@Validated
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping
    public ResponseEntity<Attendance> addAttendance(@RequestBody @Valid AttendanceForm attendance) {
        Attendance newAttendance = attendanceService.addAttendance(attendance);
        return new ResponseEntity<>(newAttendance, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Attendance>> listAttendances() {
        List<Attendance> attendances = attendanceService.listAttendances();
        return new ResponseEntity<>(attendances, HttpStatus.OK);
    }

}
