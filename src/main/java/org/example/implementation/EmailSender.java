package org.example.implementation;

public class EmailSender implements IMessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje por correo... \n" + message);
    }
}
