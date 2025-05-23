package org.example.company.service.impl;

import org.example.company.domain.User;
import org.example.company.service.NotificationService;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Send email notification with text: " + message);
    }
}
