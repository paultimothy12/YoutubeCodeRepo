package com.timothy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceInterImpl implements ServiceInterface {
    private final MessageGenerator messageGenerator;

    @Autowired
    public ServiceInterImpl(MessageGenerator messageGenerator) {
        this.messageGenerator = messageGenerator;
    }

    @Override
    public String getMainMessage(String userName) {
        return messageGenerator.getMainMessage(userName);
    }
}
