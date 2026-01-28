package com.example.sentiment.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/sentiment")
public class SentimentController {

@GetMapping
public String home() {
    return "Use POST /sentiment with JSON body";
}

    @PostMapping
    public String analyze(@RequestBody Map<String, String> input) {

        RestTemplate restTemplate = new RestTemplate();

        String mlUrl = "http://localhost:5000/predict";

        String result = restTemplate.postForObject(
                mlUrl,
                input,
                String.class
        );

        return result;
    }
}
