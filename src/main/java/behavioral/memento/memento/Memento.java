package behavioral.memento.memento;

/**
 * Memento is the memento class for the Memento pattern.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
} 