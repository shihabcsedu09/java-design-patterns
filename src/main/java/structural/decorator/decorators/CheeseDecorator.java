package structural.decorator.decorators;

import structural.decorator.model.Sandwich;

public class CheeseDecorator extends SandwichDecorator {

    protected double cheeseUnitPrice = 5;
    protected int numOfCheese;

    Sandwich currentSandwich;

    public CheeseDecorator(Sandwich sandwich, int numOfCheese){
        currentSandwich = sandwich;
        this.numOfCheese = numOfCheese;
    }


    public String getDescription() {
        return "Cheese";
    }

    public Double price() {
        return currentSandwich.price() + numOfCheese*cheeseUnitPrice;
    }
}
