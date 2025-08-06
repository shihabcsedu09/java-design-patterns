/**
 * SauceDecorator adds sauce to a sandwich.
 * This is a concrete decorator in the Decorator pattern.
 */
package structural.decorator.decorators;

import structural.decorator.component.Sandwich;

public class SauceDecorator extends SandwichDecorator {
    // Price for adding sauce
    protected Double saucePrice = 5.0;

    // The sandwich being decorated
    Sandwich currentSandwich;

    /**
     * Constructs a SauceDecorator.
     * @param sandwich the sandwich to decorate
     */
    public SauceDecorator(Sandwich sandwich) {
        currentSandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return currentSandwich.getDescription() + ", Sauce";
    }

    @Override
    public Double price() {
        return currentSandwich.price() + this.saucePrice;
    }
}
