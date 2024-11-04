package com.example.devops;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String toLowercase(String message) {
        if (message == null) {
            return message.toLowerCase();
        }
        return message.toLowerCase();
    }
}
