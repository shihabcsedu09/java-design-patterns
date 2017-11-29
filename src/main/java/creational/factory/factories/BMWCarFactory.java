package creational.factory.factories;

import creational.factory.product.BMWCar;
import creational.factory.product.Car;
import creational.factory.product.CarType;

public class BMWCarFactory implements CarFactory {
    public Car buildCar(CarType carType) {
        return new BMWCar(carType);
    }
}
