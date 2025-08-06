package behavioral.command.command;

import behavioral.command.Stock;

/**
 * SellStock is a concrete command for the Command pattern.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
} 