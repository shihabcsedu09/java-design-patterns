/**
 * BeefSandwich is a concrete component representing a beef sandwich.
 */
package structural.decorator.component;

public class BeefSandwich extends BaseSandwich {
    // Additional price for beef
    protected double beefPrice = 25.0;

    @Override
    public String getDescription() {
        return "Beef Sandwich";
    }

    @Override
    public Double price() {
        return super.baseSandwich + this.beefPrice;
    }
}
