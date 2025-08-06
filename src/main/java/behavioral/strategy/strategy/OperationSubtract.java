package behavioral.strategy.strategy;

/**
 * OperationSubtract is a concrete strategy for the Strategy pattern.
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
} 