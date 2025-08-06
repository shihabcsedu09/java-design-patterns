package creational.builder;

import creational.builder.product.House;

/**
 * CivilEngineer is the director that constructs a House using a HouseBuilder.
 */
public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }

    public void constructHouse() {
        houseBuilder.createNewHouse();
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }
}