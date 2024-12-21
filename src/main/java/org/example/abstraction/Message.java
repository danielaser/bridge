package org.example.abstraction;

import org.example.implementation.IMessageSender;

public abstract class Message {
    protected IMessageSender sender;

    public Message(IMessageSender sender) {
        this.sender = sender;
    }

    public Message() {
    }

    public abstract void sendMessage(String content);
}
