package behavioral.chainofresponsibility.handler;

/**
 * ErrorLogger is a concrete handler for the Chain of Responsibility pattern.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
} 