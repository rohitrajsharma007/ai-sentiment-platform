package com.example.sentiment.repository;

import com.example.sentiment.entity.SentimentRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentRepository extends JpaRepository<SentimentRecord, Long> {
}
