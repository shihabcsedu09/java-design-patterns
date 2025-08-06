package behavioral.observer.observer;

/**
 * Observer is the observer interface for the Observer pattern.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
} 