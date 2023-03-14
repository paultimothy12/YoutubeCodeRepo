package com.timothy.service;

import org.springframework.stereotype.Service;

@Service
public final class MessageGenerator {
    public String getMainMessage(String userName) {
        return "Hello " + userName;
    }
}
