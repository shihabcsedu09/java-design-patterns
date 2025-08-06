package behavioral.mediator;

import behavioral.mediator.colleague.User;

/**
 * Demonstrates the Mediator pattern by using a chat room to mediate user communication.
 */
public class App {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
} 