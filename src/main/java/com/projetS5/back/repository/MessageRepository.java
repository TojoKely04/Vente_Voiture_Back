package com.projetS5.back.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projetS5.back.model.Message;

public interface MessageRepository extends MongoRepository<Message ,String> {

}
