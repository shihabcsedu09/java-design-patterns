/**
 * FordCar is a concrete product representing a Ford car.
 */
package creational.factory.product;

public class FordCar implements Car {
    private CarType carType;

    /**
     * Constructs a FordCar of the given type.
     * @param carType the type of Ford car
     */
    public FordCar(CarType carType) {
        this.carType = carType;
    }

    @Override
    public CarType getCarType() {
        return this.carType;
    }

    @Override
    public String getDescription() {
        return "A Ford Car of " + carType.name() + " type";
    }
}
