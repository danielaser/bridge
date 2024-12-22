package org.example.implementation;

public class WhatsAppSender implements IMessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje por WhatsApp... \n" + message);
    }
}
