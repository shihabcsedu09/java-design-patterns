/**
 * BMWCarFactory is a concrete factory that creates BMW cars.
 */
package creational.factory.factories;

import creational.factory.product.BMWCar;
import creational.factory.product.Car;
import creational.factory.product.CarType;

public class BMWCarFactory implements CarFactory {
    /**
     * Builds a BMW car of the specified type.
     * @param carType the type of BMW car to build
     * @return a new BMWCar instance
     */
    public Car buildCar(CarType carType) {
        return new BMWCar(carType);
    }
}
