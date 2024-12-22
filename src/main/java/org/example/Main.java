package org.example;

import org.example.abstraction.EmailMessage;
import org.example.abstraction.Message;
import org.example.abstraction.TextMessage;
import org.example.implementation.EmailSender;
import org.example.implementation.SmsSender;
import org.example.implementation.WhatsAppSender;
import org.example.user.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Daniela");
        User user2 = new User("Maria");

        SmsSender smsSender = new SmsSender();
        EmailSender emailSender = new EmailSender();
        WhatsAppSender whatsAppSender = new WhatsAppSender();

        Message textMessage = new TextMessage(smsSender);
        Message emailMessage = new EmailMessage(emailSender);
        Message textMessage2 = new TextMessage(whatsAppSender);

        user1.sendMessage("Hola, como has estado? ", textMessage);
        user2.sendMessage("Buenos dias, por medio de este correo... ", emailMessage);
        user1.sendMessage("what's up?", textMessage2);
    }
}