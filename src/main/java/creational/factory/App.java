package creational.factory;

import creational.factory.factories.BMWCarFactory;
import creational.factory.factories.CarFactory;
import creational.factory.factories.FordCarFactory;
import creational.factory.product.Car;
import creational.factory.product.CarType;

public class App {

    public static void main(String[] args){
        CarFactory aBMWCarFactory = new BMWCarFactory();
        CarFactory aFordCarFactory = new FordCarFactory();

        Car aBMWSUVCar = aBMWCarFactory.buildCar(CarType.SUV);
        System.out.println(aBMWSUVCar.getDescription());

        Car aForSedanCar = aFordCarFactory.buildCar(CarType.SEDAN);
        System.out.println(aForSedanCar.getDescription());

    }
}
