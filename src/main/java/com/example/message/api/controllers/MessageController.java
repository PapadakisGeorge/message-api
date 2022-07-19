package com.example.message.api.controllers;

import com.example.message.api.dto.MessageCreationRequest;
import com.example.message.api.model.Message;
import com.example.message.api.services.MessageServiceImpl;
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
