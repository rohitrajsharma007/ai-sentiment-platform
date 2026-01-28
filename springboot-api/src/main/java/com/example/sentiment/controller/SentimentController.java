package com.example.sentiment.controller;

import com.example.sentiment.model.SentimentRequest;
import com.example.sentiment.model.SentimentResponse;
import com.example.sentiment.entity.SentimentRecord;
import com.example.sentiment.repository.SentimentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/sentiment")
public class SentimentController {

    @Autowired
    private SentimentRepository repo;

    @PostMapping
    public SentimentResponse analyze(@RequestBody SentimentRequest request) {

        String text = request.getText().toLowerCase();
        String sentiment = "POSITIVE";

        if (text.contains("sad")
                || text.contains("bad")
                || text.contains("angry")
                || text.contains("hate")
                || text.contains("worst")) {

            sentiment = "NEGATIVE";
        }

        SentimentRecord record = new SentimentRecord();
        record.setText(request.getText());
        record.setSentiment(sentiment);

        repo.save(record);

        return new SentimentResponse(sentiment);
    }

    @GetMapping
    public List<SentimentRecord> all() {
        return repo.findAll();
    }
}
