/**
 * Car is the product interface for all types of cars.
 * This is used by the factory to create different car variants.
 */
package creational.factory.product;

public interface Car {
    /**
     * Returns a description of the car.
     * @return description string
     */
    String getDescription();
    /**
     * Returns the type of the car.
     * @return CarType enum
     */
    CarType getCarType();
}
