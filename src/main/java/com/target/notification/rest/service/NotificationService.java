package com.target.notification.rest.service;

import com.target.notification.dto.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private MailService mailService;

    //Add other notification services

    public void sendNotifications(NotificationDTO notificationDTO) {
        mailService.sendMail(notificationDTO);
        //call to other notification services
    }


}
