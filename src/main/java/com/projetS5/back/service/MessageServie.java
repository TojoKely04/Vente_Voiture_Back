package com.projetS5.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.projetS5.back.model.Message;
import com.projetS5.back.repository.MessageRepository;

@Service
public class MessageServie {
    @Autowired
    private final MessageRepository messageRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public MessageServie(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message save( Message message){
        return messageRepository.save(message);
    }

    public List<Message> getMessages(int iduser) {
        return messageRepository.getLastMessages();
    }

    public void deleteMessage(String id){
        messageRepository.deleteById(id);
    }

    public List<Message> getMessage(int sender , int receiver) {
        Criteria senderCriteria = new Criteria().andOperator(Criteria.where("idSender").is(sender), Criteria.where("idReceiver").is(receiver));
        Criteria receiverCriteria = new Criteria().andOperator(Criteria.where("idReceiver").is(sender), Criteria.where("idSender").is(receiver));

        Criteria combinedCriteria = new Criteria().orOperator(senderCriteria, receiverCriteria);

        Query query = new Query(combinedCriteria);
        query.with(Sort.by(Sort.Direction.ASC, "datetime"));

        List<Message> messages = mongoTemplate.find(query, Message.class);

        return messages;
    }
}
