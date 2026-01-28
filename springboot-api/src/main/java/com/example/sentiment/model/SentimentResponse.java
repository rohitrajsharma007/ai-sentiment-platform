package com.example.sentiment.model;

public class SentimentResponse {

    private String sentiment;

    public SentimentResponse(String sentiment) {
        this.sentiment = sentiment;
    }

    public String getSentiment() {
        return sentiment;
    }
}
