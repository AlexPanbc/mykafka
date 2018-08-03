package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class consumer {
    @KafkaListener(topics = {"test11"})
    public void consumer(String message) {
        System.out.println("-------------------------------- : " + message);
    }

    @KafkaListener(topics = {"topic1"})
    public void consumer1(String ms) {
        System.out.println("*******************: " + ms);
    }

}
