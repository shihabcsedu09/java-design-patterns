/**
 * ChickenSandwich is a concrete component representing a chicken sandwich.
 */
package structural.decorator.component;

public class ChickenSandwich extends BaseSandwich {
    // Additional price for chicken
    protected double chickenPrice = 20.0;

    @Override
    public String getDescription() {
        return "Chicken Sandwich";
    }

    @Override
    public Double price() {
        return super.price() + this.chickenPrice;
    }
}
