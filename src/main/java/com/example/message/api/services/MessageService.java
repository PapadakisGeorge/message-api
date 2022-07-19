package com.example.message.api.services;

import com.example.message.api.dto.MessageCreationRequest;
import com.example.message.api.model.Message;

import javax.validation.Valid;
import java.util.List;

public interface MessageService {

    void createMessage(@Valid MessageCreationRequest messageCreationRequest);

    List<Message> getAllMessages();
}
