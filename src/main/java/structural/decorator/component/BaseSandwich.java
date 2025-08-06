/**
 * BaseSandwich is an abstract class that implements Sandwich.
 * It provides a base price for all sandwiches.
 */
package structural.decorator.component;

public abstract class BaseSandwich implements Sandwich {
    // Base price for any sandwich
    protected double baseSandwich = 10.0;

    public abstract String getDescription();

    @Override
    public Double price() {
        return baseSandwich;
    }
}
