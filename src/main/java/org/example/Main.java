package org.example;

import org.example.abstraction.EmailMessage;
import org.example.abstraction.Message;
import org.example.abstraction.TextMessage;
import org.example.implementation.EmailSender;
import org.example.implementation.TextSender;
import org.example.user.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Daniela");
        User user2 = new User("Maria");

        TextSender textSender = new TextSender();
        EmailSender emailSender = new EmailSender();

        Message textMessage = new TextMessage(textSender);
        Message emailMessage = new EmailMessage(emailSender);

        user1.sendMessage("Hola, como has estado? ", textMessage);
        user2.sendMessage("Buenos dias, por medio de este correo... ", emailMessage);
    }
}