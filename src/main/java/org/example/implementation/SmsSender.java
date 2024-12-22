package org.example.implementation;

public class SmsSender implements IMessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje por sms... \n" + message);
    }
}
