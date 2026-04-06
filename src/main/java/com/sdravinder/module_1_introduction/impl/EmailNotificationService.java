package com.sdravinder.module_1_introduction.impl;

import com.sdravinder.module_1_introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("emailNotificationService")
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email Sending: " + message);
    }
}
