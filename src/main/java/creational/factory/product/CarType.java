package creational.factory.product;

public enum CarType {
    SUV("suv"), SEDAN("sedan"), ELECTRIC("electric");

    private String catType;

    CarType(String title) {
        this.catType = catType;
    }

    @Override
    public String toString() {
        return catType;
    }
}
