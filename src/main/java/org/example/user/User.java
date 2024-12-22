package org.example.user;

import org.example.abstraction.Message;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public void sendMessage(String content, Message message) {
        System.out.println(name + " esta enviando un mensaje:");
        message.sendMessageContent(content);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
