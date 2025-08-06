/**
 * Demonstrates the Factory Method pattern by creating cars using different factories.
 */
package creational.factory;

import creational.factory.factories.BMWCarFactory;
import creational.factory.factories.CarFactory;
import creational.factory.factories.FordCarFactory;
import creational.factory.product.Car;
import creational.factory.product.CarType;

public class App {

    public static void main(String[] args) {
        // Create a factory for BMW cars
        CarFactory aBMWCarFactory = new BMWCarFactory();
        // Create a factory for Ford cars
        CarFactory aFordCarFactory = new FordCarFactory();

        // Use the BMW factory to build an SUV
        Car aBMWSUVCar = aBMWCarFactory.buildCar(CarType.SUV);
        System.out.println(aBMWSUVCar.getDescription());

        // Use the Ford factory to build a Sedan
        Car aFordSedanCar = aFordCarFactory.buildCar(CarType.SEDAN);
        System.out.println(aFordSedanCar.getDescription());
    }
}
