package com.target.notification.rest;

import com.target.notification.rest.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
public class Notification {

    @Autowired
    private MailService mailService;

    @PostMapping("")
    public ResponseEntity<?> sendNotification() {
        mailService.sendMail();
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
}
