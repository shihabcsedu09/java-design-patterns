package behavioral.strategy.strategy;

/**
 * OperationAdd is a concrete strategy for the Strategy pattern.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
} 