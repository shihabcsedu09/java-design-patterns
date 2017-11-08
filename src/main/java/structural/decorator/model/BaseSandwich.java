package structural.decorator.model;

public abstract class BaseSandwich implements Sandwich {

    protected double baseSandwich = 10.0;

    public abstract String getDescription();

    public Double price() {
        return baseSandwich;
    }
}
