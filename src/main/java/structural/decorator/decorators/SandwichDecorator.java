package structural.decorator.decorators;

import structural.decorator.component.Sandwich;

public abstract class SandwichDecorator implements Sandwich {
    public abstract String getDescription();
    public abstract Double price();
}
