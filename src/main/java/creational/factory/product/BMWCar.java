package creational.factory.product;

public class BMWCar implements Car{
    public CarType carType;

    public BMWCar(CarType carType){
        this.carType = carType;
    }

    public CarType getCarType() {
        return this.carType;
    }

    public String getDescription() {
        return "A BMW Car of " + carType.name()+ " type";
    }

}
