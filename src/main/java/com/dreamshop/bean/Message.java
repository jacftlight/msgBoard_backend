package com.dreamshop.bean;

import java.util.Date;

public class Message {

    private Integer id;
    private String name;
    private String email;
    private String message;
    // private Boolean isRead;
    private Date datetime;

    public Message() {}

    public Message(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public Message(Integer id, String name, String email, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public Message(Integer id, String name, String email, String message, Date datetime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
        this.datetime = datetime;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
