package behavioral.strategy;

import behavioral.strategy.strategy.OperationAdd;
import behavioral.strategy.strategy.OperationMultiply;
import behavioral.strategy.strategy.OperationSubtract;

/**
 * Demonstrates the Strategy pattern by using different mathematical operations.
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
} 