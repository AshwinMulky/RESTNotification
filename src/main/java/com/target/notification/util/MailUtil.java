package com.target.notification.util;

import com.target.notification.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

@Component
public class MailUtil {

    @Autowired
    private AppProperties appProperties;

    private Session session;

    @PostConstruct
    public void init() {

        Properties props = new Properties();
        props.put("mail.smtp.auth",appProperties.getAuth());
        props.put("mail.smtp.starttls.enable", appProperties.getStarttls());
        props.put("mail.smtp.host", appProperties.getHost());
        props.put("mail.smtp.port", appProperties.getPort());

        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(appProperties.getUserName(), appProperties.getPassword());
                    }
                });
    }

    public Session getSession() {
        return session;
    }

}
