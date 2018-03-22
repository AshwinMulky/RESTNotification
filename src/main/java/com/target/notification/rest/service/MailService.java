package com.target.notification.rest.service;

import com.target.notification.config.AppProperties;
import com.target.notification.dto.NotificationDTO;
import com.target.notification.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class MailService {

    @Autowired
    private MailUtil mailUtil;

    @Async
    public void sendMail(NotificationDTO notificationDTO) {

        try {
            Message message = new MimeMessage(mailUtil.getSession());
            message.setFrom(new InternetAddress(notificationDTO.getFrom()));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(notificationDTO.getTo()));
            message.setSubject(notificationDTO.getSubject());
            message.setText(notificationDTO.getContent());

            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
