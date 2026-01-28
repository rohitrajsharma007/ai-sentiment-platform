package com.example.sentiment.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SentimentRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private String sentiment;
    private LocalDateTime createdAt = LocalDateTime.now();

    public SentimentRecord() {}

    public void setText(String text) {
        this.text = text;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getSentiment() {
        return sentiment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
