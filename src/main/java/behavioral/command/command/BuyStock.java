package behavioral.command.command;

import behavioral.command.Stock;

/**
 * BuyStock is a concrete command for the Command pattern.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
} 