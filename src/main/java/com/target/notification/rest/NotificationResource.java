package com.target.notification.rest;

import com.target.notification.dto.NotificationDTO;
import com.target.notification.rest.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/notifications")
public class NotificationResource {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("")
    public ResponseEntity<?> sendNotification(@RequestBody NotificationDTO notificationDTO) {
        notificationService.sendNotifications(notificationDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
