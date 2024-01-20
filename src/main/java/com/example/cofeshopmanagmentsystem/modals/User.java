package com.example.cofeshopmanagmentsystem.modals;

import java.util.Date;

public class User {
    String id;
    String username;
    String password;
    String question;
    String answer;
    Date date;
    public User(String id, String username, String password, String question, String answer, Date date) {
        this(username, password, question, answer, date);
        this.id = id;
    }
    public User(String username, String password, String question, String answer, Date date) {
        this.username = username;
        this.password = password;
        this.question = question;
        this.answer = answer;
        this.date = date;
    }
}
