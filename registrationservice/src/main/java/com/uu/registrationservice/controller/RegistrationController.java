package com.uu.registrationservice.controller;

import com.uu.registrationservice.models.Registration;
import com.uu.registrationservice.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/create")
    public Registration createRegistration(@RequestBody Registration registration) {
        return registrationService.createRegistration(registration);
    }

    @GetMapping("/all")
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public Registration getRegistrationById(@PathVariable Long id) {
        return registrationService.getRegistrationById(id);
    }

    @GetMapping("/student/{studentId}")
    public List<Registration> getRegistrationsByStudent(@PathVariable Long studentId) {
        return registrationService.getRegistrationsByStudent(studentId);
    }

    @GetMapping("/disciplina/{disciplinaId}")
    public List<Registration> getRegistrationsBySubject(@PathVariable Long subjectId) {
        return registrationService.getRegistrationsBySubject(subjectId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
    }
}
