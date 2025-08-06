/**
 * CheeseDecorator adds cheese to a sandwich.
 * This is a concrete decorator in the Decorator pattern.
 */
package structural.decorator.decorators;

import structural.decorator.component.Sandwich;

public class CheeseDecorator extends SandwichDecorator {
    // Price per unit of cheese
    protected double cheeseUnitPrice = 5;
    // Number of cheese units to add
    protected int numOfCheese;

    // The sandwich being decorated
    Sandwich currentSandwich;

    /**
     * Constructs a CheeseDecorator.
     * @param sandwich the sandwich to decorate
     * @param numOfCheese number of cheese units to add
     */
    public CheeseDecorator(Sandwich sandwich, int numOfCheese) {
        currentSandwich = sandwich;
        this.numOfCheese = numOfCheese;
    }

    @Override
    public String getDescription() {
        return currentSandwich.getDescription() + ", Cheese x" + numOfCheese;
    }

    @Override
    public Double price() {
        return currentSandwich.price() + numOfCheese * cheeseUnitPrice;
    }
}
