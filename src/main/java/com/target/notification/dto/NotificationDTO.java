package com.target.notification.dto;

public class NotificationDTO {

    private String from;

    private String to;

    private String subject;

    private String content;

    public String getFrom() {
        return from;
    }

    public NotificationDTO setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public NotificationDTO setTo(String to) {
        this.to = to;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public NotificationDTO setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getContent() {
        return content;
    }

    public NotificationDTO setContent(String content) {
        this.content = content;
        return this;
    }
}
