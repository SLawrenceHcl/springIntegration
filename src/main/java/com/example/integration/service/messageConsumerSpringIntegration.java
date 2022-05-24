package com.example.integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Service;

@Service
public class messageConsumerSpringIntegration {

    @Autowired
    MessageChannel pubSubChannel;

    @ServiceActivator(inputChannel= "pubSubChannel")
    public void messageHandler(Message message) {
        System.out.println("out");
        System.out.println(message.getPayload());
        //return message -> System.out.println(message.getPayload());
    }

}
