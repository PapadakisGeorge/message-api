package com.example.messageapi.dto;

public record MessageCreationRequest(String messageTitle, String messageBody, String messageSender) {
}
