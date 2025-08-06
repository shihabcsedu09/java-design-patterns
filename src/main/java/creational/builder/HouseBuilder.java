package creational.builder;

import creational.builder.product.House;

/**
 * HouseBuilder is the abstract builder for constructing House objects.
 */
public abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }
    public void createNewHouse() {
        house = new House();
    }

    public abstract void buildFoundation();
    public abstract void buildStructure();
    public abstract void buildRoof();
    public abstract void buildInterior();
}