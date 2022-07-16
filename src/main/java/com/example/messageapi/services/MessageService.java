package com.example.messageapi.services;

import com.example.messageapi.dto.MessageCreationRequest;
import com.example.messageapi.model.Message;

import javax.validation.Valid;
import java.util.List;

public interface MessageService {

    void createMessage(@Valid MessageCreationRequest messageCreationRequest);

    List<Message> getAllMessages();
}
