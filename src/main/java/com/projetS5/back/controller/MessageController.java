package com.projetS5.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.Message;
import com.projetS5.back.service.MessageServie;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageServie messageServie;

    @PostMapping
    public Message sendMessage(@RequestBody Message message){
        return messageServie.save(message);
    }
    @GetMapping("/{sender}/{receiver}")
    public List<Message> getMessage(@PathVariable int sender , @PathVariable int receiver) {
        return messageServie.getMessage(sender,receiver);
    }
    @GetMapping("/{user}")
    public List<Message> getMessages(@PathVariable int user ) {
        return messageServie.getMessages(user);
    }
 
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable String id){
        messageServie.deleteMessage(id);
    }
}
