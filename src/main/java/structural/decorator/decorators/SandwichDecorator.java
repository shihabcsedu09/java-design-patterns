/**
 * SandwichDecorator is the abstract decorator class for Sandwich.
 * It allows dynamic addition of responsibilities to Sandwich objects.
 */
package structural.decorator.decorators;

import structural.decorator.component.Sandwich;

public abstract class SandwichDecorator implements Sandwich {
    public abstract String getDescription();
    public abstract Double price();
}
