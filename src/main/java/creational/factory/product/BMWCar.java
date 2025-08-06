/**
 * BMWCar is a concrete product representing a BMW car.
 */
package creational.factory.product;

public class BMWCar implements Car {
    private CarType carType;

    /**
     * Constructs a BMWCar of the given type.
     * @param carType the type of BMW car
     */
    public BMWCar(CarType carType) {
        this.carType = carType;
    }

    @Override
    public CarType getCarType() {
        return this.carType;
    }

    @Override
    public String getDescription() {
        return "A BMW Car of " + carType.name() + " type";
    }
}
