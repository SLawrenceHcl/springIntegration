package com.example.integration.controller;

//import com.example.integration.integration.sampleEvent;
//import com.example.integration.integration.sampleEventPublisher;
//import com.example.integration.configuration.pubSubConf;
import com.example.integration.model.message;
//import com.example.integration.service.messageConsumer;
import com.example.integration.service.messageConsumerSpringIntegration;
import com.example.integration.service.messageProducer;
//import com.example.integration.service.messageProducerSpringIntegration;
import com.example.integration.service.messageProducerSpringIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


@RestController
public class messageController {
//    @Autowired
//    messageConsumer messageConsumer;
//
    @Autowired
    messageProducer messageProducer;
    @Autowired
    messageProducerSpringIntegration messageProducerSpringIntegration;

    @Autowired
    messageConsumerSpringIntegration messageConsumerSpringIntegration;

//    @Autowired
//    MessageChannel pubSubChannel;


//private final messageProducer messageProducer;
//
//    public messageController(messageProducer producerService) {
//        this.messageProducer = producerService;
//    }
    @PostMapping("/s")
    public void s(@RequestParam String message){
        messageProducerSpringIntegration.sendMessage(message);//message
//        Message<String> message2 = MessageBuilder
//                .withPayload(message)
//                        .setHeader("key1", "value1")
//                        .setHeader("key2", "value2")
//                .build();
//        pubSubChannel.send(message2);
    }




    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String message) {
        messageProducer.sendMessage(message);
    }
//
//    @GetMapping(value = "/getAll")
//    public Flux<message> getAll(){
//        return messageConsumer.getAllMessages();
//    }
}
