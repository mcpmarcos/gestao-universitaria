package controllers;

import model.AcademicHistory;
import model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TranscriptHistoryService;

import java.util.List;

@RestController
@RequestMapping("/transcript-history")
@Validated
public class TranscriptHistoryController {

    @Autowired
    private TranscriptHistoryService transcriptHistoryService;

    @GetMapping("/transcripts")
    public ResponseEntity<List<Transcript>> generateTranscripts() {
        List<Transcript> transcripts = transcriptHistoryService.generateTranscripts();
        return new ResponseEntity<>(transcripts, HttpStatus.OK);
    }

    @GetMapping("/histories")
    public ResponseEntity<List<AcademicHistory>> generateHistories() {
        List<AcademicHistory> histories = transcriptHistoryService.generateHistories();
        return new ResponseEntity<>(histories, HttpStatus.OK);
    }
}
