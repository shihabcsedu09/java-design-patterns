/**
 * CarFactory is the abstract factory interface for creating cars of different types.
 * This demonstrates the Factory Method pattern.
 */
package creational.factory.factories;

import creational.factory.product.Car;
import creational.factory.product.CarType;

public interface CarFactory {
    /**
     * Builds a car of the specified type.
     * @param carType the type of car to build
     * @return a new Car instance
     */
    Car buildCar(CarType carType);
}
