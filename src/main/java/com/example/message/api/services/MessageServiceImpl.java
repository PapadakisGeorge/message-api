package com.example.message.api.services;

import com.example.message.api.repository.MessageRepository;
import com.example.message.api.dto.MessageCreationRequest;
import com.example.message.api.model.Message;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public record MessageServiceImpl(MessageRepository messageRepository) implements MessageService {

    @Override
    public void createMessage(@Valid MessageCreationRequest messageCreationRequest) {
        Message message = Message.builder()
                .messageTitle(messageCreationRequest.messageTitle())
                .messageBody(messageCreationRequest.messageBody())
                .messageSender(messageCreationRequest.messageSender())
                .build();
        messageRepository.save(message);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
