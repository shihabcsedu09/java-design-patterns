package creational.builder;

import creational.builder.product.House;

/**
 * Demonstrates the Builder pattern by constructing different types of houses.
 */
public class App {
    public static void main(String[] args) {
        // Build an Igloo house
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer1 = new CivilEngineer(iglooBuilder);
        engineer1.constructHouse();
        House igloo = engineer1.getHouse();
        System.out.println(igloo);

        // Build a Brick house
        HouseBuilder brickBuilder = new BrickHouseBuilder();
        CivilEngineer engineer2 = new CivilEngineer(brickBuilder);
        engineer2.constructHouse();
        House brickHouse = engineer2.getHouse();
        System.out.println(brickHouse);
    }
}