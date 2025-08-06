/**
 * CarType is an enum representing different types of cars.
 */
package creational.factory.product;

public enum CarType {
    SUV("suv"), SEDAN("sedan"), ELECTRIC("electric");

    private String carType;

    CarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return carType;
    }
}
