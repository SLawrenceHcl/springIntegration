//package com.example.integration.service;
//
//import com.example.integration.model.message;
//import com.example.integration.repository.messageRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@Service
//public class messageConsumer {
//
//    @Autowired
//    messageRepo messageRepo;
//
//
//    public Mono<message> createMessage(message message){
//        System.out.println("Should save to db here");
//        return messageRepo.save(message);
//    }
//    public Flux<message> getAllMessages(){
//        return messageRepo.findAll();
//    }
//
//    @KafkaListener(topics = "kafkaTopic", groupId = "group_id")
//    public void consume(String message) {
//        message temp = new message(message);
//        Mono<message> temp2 = createMessage(temp);
//        //db save will not occur if create message isn't stored and used
//        System.out.println("Consumed: " + temp2.block().getMessage());
//    }
//
//
//}
