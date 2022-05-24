package com.example.integration.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class messageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC = "publisher-in";

    public messageProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message) {
        System.out.println("Producing message: " + message);
        //ListenableFuture<SendResult<String, String>> future = this.kafkaTemplate.send(TOPIC, message);
        this.kafkaTemplate.send(TOPIC, message);

        //below is extra to check success
//        future.addCallback(new ListenableFutureCallback<>() {
//            @Override
//            public void onFailure(Throwable ex) {
//                System.out.println("Failure");
//            }
//
//            @Override
//            public void onSuccess(SendResult<String, String> result) {
//                System.out.println("Success");
//            }
//        });
    }
}
