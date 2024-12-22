package org.example.abstraction;

import org.example.implementation.IMessageSender;

public class TextMessage extends Message {

    public TextMessage(IMessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessageContent(String content) {
        sender.sendMessage("<> Mensaje de texto: " + content);
    }
}
