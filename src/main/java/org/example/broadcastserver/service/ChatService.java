package org.example.broadcastserver.service;

import org.example.broadcastserver.model.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    // In-memory storage (can replace with DB later)
    private final List<ChatMessage> messageHistory = new ArrayList<>();

    // Save message
    public ChatMessage processMessage(ChatMessage message) {
        // You can add logic here (validation, filtering, etc.)
        messageHistory.add(message);
        return message;
    }

    // Get all previous messages (optional feature)
    public List<ChatMessage> getMessageHistory() {
        return messageHistory;
    }
}
