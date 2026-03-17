package org.example.broadcastserver.controller;

import org.example.broadcastserver.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class  ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage broadcastMessage(ChatMessage message) {
        System.out.println(message.getSender() + ": " + message.getContent());
        return message; // broadcast to all
    }
}
