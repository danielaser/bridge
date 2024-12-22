package org.example.implementation;

public class TextSender implements IMessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje de texto... \n" + message);
    }
}
