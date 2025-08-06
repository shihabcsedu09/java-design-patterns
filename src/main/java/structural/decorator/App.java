/**
 * Demonstrates the Decorator pattern by dynamically adding cheese and sauce to sandwiches.
 */
package structural.decorator;

import structural.decorator.decorators.CheeseDecorator;
import structural.decorator.decorators.SauceDecorator;
import structural.decorator.component.BeefSandwich;
import structural.decorator.component.ChickenSandwich;
import structural.decorator.component.Sandwich;

public class App {

    public static void main(String[] args) {
        // Create a plain chicken sandwich
        Sandwich myChickenSandwich = new ChickenSandwich();
        System.out.println("Chicken Sandwich Price : " + myChickenSandwich.price());

        // Add 5 cheese to the current sandwich
        myChickenSandwich = new CheeseDecorator(myChickenSandwich, 5);
        System.out.println("Chicken Sandwich Price with 5 cheese : " + myChickenSandwich.price());

        // Add sauce to the current sandwich
        myChickenSandwich = new SauceDecorator(myChickenSandwich);
        System.out.println("Chicken Sandwich Price with 5 cheese and sauce : " + myChickenSandwich.price());

        // Beef Sandwich with 3 cheese and sauce
        Sandwich myBeefSandwich = new SauceDecorator(new CheeseDecorator(new BeefSandwich(), 3));
        System.out.println("Beef Sandwich Price with 3 cheese and sauce : " + myBeefSandwich.price());
    }
}
