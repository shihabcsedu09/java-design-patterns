package creational.factory.factories;

import creational.factory.product.Car;
import creational.factory.product.CarType;
import creational.factory.product.FordCar;

public class FordCarFactory implements CarFactory {
    public Car buildCar(CarType carType) {
        return new FordCar(carType);
    }

}
