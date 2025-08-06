/**
 * FordCarFactory is a concrete factory that creates Ford cars.
 */
package creational.factory.factories;

import creational.factory.product.Car;
import creational.factory.product.CarType;
import creational.factory.product.FordCar;

public class FordCarFactory implements CarFactory {
    /**
     * Builds a Ford car of the specified type.
     * @param carType the type of Ford car to build
     * @return a new FordCar instance
     */
    public Car buildCar(CarType carType) {
        return new FordCar(carType);
    }
}
