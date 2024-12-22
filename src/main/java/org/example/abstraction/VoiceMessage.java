package org.example.abstraction;

import org.example.implementation.IMessageSender;

public class VoiceMessage extends Message{
    public VoiceMessage(IMessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessageContent(String content) {
        sender.sendMessage(">>>> Mensaje de voz: " + content);
    }
}
