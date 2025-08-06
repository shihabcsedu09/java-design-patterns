package creational.builder;

/**
 * IglooHouseBuilder is a concrete builder for constructing igloo houses.
 */
public class IglooHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() {
        house.setFoundation("Ice blocks");
    }
    @Override
    public void buildStructure() {
        house.setStructure("Ice walls");
    }
    @Override
    public void buildRoof() {
        house.setRoof("Ice dome");
    }
    @Override
    public void buildInterior() {
        house.setInterior("Ice carvings");
    }
}