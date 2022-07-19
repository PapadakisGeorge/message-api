package com.example.message.api.dto;

public record MessageCreationRequest(String messageTitle, String messageBody, String messageSender) {
}
