package com.example.messageapi.controllers;

import com.example.messageapi.dto.MessageCreationRequest;
import com.example.messageapi.model.Message;
import com.example.messageapi.services.MessageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/messages")
public record MessageController(MessageServiceImpl messageService) {

    @PostMapping
    public void createMessage(@RequestBody MessageCreationRequest messageCreationRequest){
        log.info("new lesson was inserted {}", messageCreationRequest);
        messageService.createMessage(messageCreationRequest);
    }

    @GetMapping("/all")
    List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }
}
