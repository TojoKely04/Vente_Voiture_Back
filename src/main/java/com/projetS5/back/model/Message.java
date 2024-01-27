package com.projetS5.back.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("messages")
public class Message {
    @Id
    private String id;
    private int idSender;
    private int idReceiver;
    private String message;
    private LocalDateTime datetime;
    
    public Message(String id, int idSender, int idReceiver, String message, LocalDateTime datetime) {
        this.id = id;
        this.idSender = idSender;
        this.idReceiver = idReceiver;
        this.message = message;
        this.datetime = datetime;
    }
    public Message() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getIdSender() {
        return idSender;
    }
    public void setIdSender(int idSender) {
        this.idSender = idSender;
    }
    public int getIdReceiver() {
        return idReceiver;
    }
    public void setIdReceiver(int idReceiver) {
        this.idReceiver = idReceiver;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public LocalDateTime getDatetime() {
        return datetime;
    }
    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
}
