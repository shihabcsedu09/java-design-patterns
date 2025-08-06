package behavioral.interpreter.expression;

/**
 * Expression is the abstract expression for the Interpreter pattern.
 */
public interface Expression {
    boolean interpret(String context);
} 