package com.projetS5.back.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.projetS5.back.model.Message;

public interface MessageRepository extends MongoRepository<Message ,String> {
        @Aggregation(
            "{"+
                "$match: {"+
                  "$or: [{ idSender: 2 }, { idReceiver: 2 }]"+
                "}"+
             "},"+
             "{"+
                "$sort: { datetime: -1 }"+
             "},"+
             "{"+
                "$group: {"+
                  "message: { $first: \"$$ROOT\" }"+
                "}"+
             "},"+
             "{"+
                "$project: {"+
                  "message: \"$message\""+
                "}"+
             "}"
        )
        List<Message> getLastMessages();
}
