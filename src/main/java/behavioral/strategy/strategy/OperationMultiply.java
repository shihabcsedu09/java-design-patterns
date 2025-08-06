package behavioral.strategy.strategy;

/**
 * OperationMultiply is a concrete strategy for the Strategy pattern.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
} 