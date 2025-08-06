package behavioral.chainofresponsibility.handler;

/**
 * FileLogger is a concrete handler for the Chain of Responsibility pattern.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
} 