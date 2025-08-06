/**
 * Sandwich is the component interface for the Decorator pattern.
 * It defines the operations that can be dynamically added to by decorators.
 */
package structural.decorator.component;

public interface Sandwich {
    /**
     * Returns a description of the sandwich.
     * @return description string
     */
    String getDescription();
    /**
     * Returns the price of the sandwich.
     * @return price as Double
     */
    Double price();
}
