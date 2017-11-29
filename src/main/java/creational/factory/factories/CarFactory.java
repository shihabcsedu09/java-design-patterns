package creational.factory.factories;

import creational.factory.product.Car;
import creational.factory.product.CarType;

public interface CarFactory {
    Car buildCar(CarType carType);
}
