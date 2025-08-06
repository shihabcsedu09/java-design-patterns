package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.handler.AbstractLogger;
import behavioral.chainofresponsibility.handler.ConsoleLogger;
import behavioral.chainofresponsibility.handler.ErrorLogger;
import behavioral.chainofresponsibility.handler.FileLogger;

/**
 * Demonstrates the Chain of Responsibility pattern by creating a chain of loggers.
 */
public class App {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
} 