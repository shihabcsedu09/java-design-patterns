package behavioral.mediator;

import behavioral.mediator.colleague.User;

/**
 * ChatRoom is the mediator for the Mediator pattern.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new java.util.Date().toString() + " [" + user.getName() + "] : " + message);
    }
} 