package org.example.abstraction;

import org.example.implementation.IMessageSender;

public class EmailMessage extends Message {
    public EmailMessage(IMessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessageContent(String content) {
        sender.sendMessage("<> Mensaje de correo: " + content);
    }
}
