package creational.factory.product;

public class FordCar implements Car{
    public CarType carType;

    public FordCar(CarType carType){
        this.carType = carType;
    }

    public CarType getCarType() {
        return this.carType;
    }

    public String getDescription() {
        return "A Ford Car of " + carType.name() + " type";
    }

}
