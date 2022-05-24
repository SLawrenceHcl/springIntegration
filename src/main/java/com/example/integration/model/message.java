package com.example.integration.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Document("message")
public class message {
    @Id
    private String messageId;
    private String message;
    public message(String message){
        this.message = message;
    }
}
