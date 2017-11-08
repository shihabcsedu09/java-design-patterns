package structural.decorator.model;

public class ChickenSandwich extends BaseSandwich {

    protected double chickenPrice = 20.0;

    public String getDescription() {
        return "Chicken Sandwich ";
    }

    @Override
    public Double price() {
        return super.price() + this.chickenPrice;
    }
}
