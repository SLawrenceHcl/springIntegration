package com.example.integration.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.*;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.config.EnablePublisher;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnablePublisher("pubSubChannel")
public class messageProducerSpringIntegration {

    @Autowired
    MessageChannel pubSubChannel;

    @Publisher(channel = "pubSubChannel")
    public Message sendMessage(String text) {  //MessageSource
        System.out.println("in");
                Message<String> message = MessageBuilder
                .withPayload(text)
                .build();
                return message;

//        MessageSource message2 = new MessageSource() {
//            @Override
//            public Message receive() {
//                Message<String> message = MessageBuilder
//                        .withPayload(text)
////                        .setHeader("key1", "value1")
////                        .setHeader("key2", "value2")
//                        .build();
//                return message;
//            }

    }
}
