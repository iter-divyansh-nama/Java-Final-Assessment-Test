package com.capgemini.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.notification.entity.Notification;
import com.capgemini.notification.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService service;

    @PostMapping
    public String send(@RequestBody Notification notification) {
        service.save(notification);
        return "Notification sent";
    }
}