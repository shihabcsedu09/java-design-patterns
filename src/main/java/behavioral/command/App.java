package behavioral.command;

import behavioral.command.command.BuyStock;
import behavioral.command.command.SellStock;

/**
 * Demonstrates the Command pattern by using a broker to execute stock orders.
 */
public class App {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
} 