package structural.decorator.component;

public class BeefSandwich extends BaseSandwich {
    protected double beefPrice = 25.0;

    public String getDescription() {
        return "Chicken Sandwich ";
    }

    @Override
    public Double price() {
        return super.baseSandwich + this.beefPrice;
    }
}
