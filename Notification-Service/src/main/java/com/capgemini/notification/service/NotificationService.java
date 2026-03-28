package com.capgemini.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.notification.entity.Notification;
import com.capgemini.notification.repository.NotificationRepository;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repository;

    public Notification save(Notification notification) {
        return repository.save(notification);
    }
}