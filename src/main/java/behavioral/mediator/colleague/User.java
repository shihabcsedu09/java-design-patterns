package behavioral.mediator.colleague;

import behavioral.mediator.ChatRoom;

/**
 * User is a colleague for the Mediator pattern.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
} 