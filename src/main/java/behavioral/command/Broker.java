package behavioral.command;

import behavioral.command.command.Order;
import java.util.ArrayList;
import java.util.List;

/**
 * Broker is the invoker for the Command pattern.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
} 