package creational.builder;

/**
 * BrickHouseBuilder is a concrete builder for constructing brick houses.
 */
public class BrickHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete, brick, and stone");
    }
    @Override
    public void buildStructure() {
        house.setStructure("Brick walls");
    }
    @Override
    public void buildRoof() {
        house.setRoof("Concrete and tile roof");
    }
    @Override
    public void buildInterior() {
        house.setInterior("Brick interior");
    }
}