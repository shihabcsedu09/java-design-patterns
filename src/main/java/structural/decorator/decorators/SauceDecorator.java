package structural.decorator.decorators;

import structural.decorator.component.Sandwich;

public class SauceDecorator extends SandwichDecorator{

    protected Double saucePrice = 5.0;

    Sandwich currentSandwich;

    public SauceDecorator(Sandwich sandwich){
        currentSandwich = sandwich;
    }

    public String getDescription() {
        return "Sauce";
    }

    public Double price() {
        return currentSandwich.price() + this.saucePrice;
    }
}
