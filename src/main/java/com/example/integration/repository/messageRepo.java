package com.example.integration.repository;

import com.example.integration.model.message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface messageRepo extends ReactiveMongoRepository<message, String>{

}
