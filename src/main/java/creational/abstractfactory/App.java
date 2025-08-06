package creational.abstractfactory;

import creational.abstractfactory.factories.FurnitureFactory;
import creational.abstractfactory.factories.ModernFurnitureFactory;
import creational.abstractfactory.factories.VictorianFurnitureFactory;
import creational.abstractfactory.product.Chair;
import creational.abstractfactory.product.Sofa;

/**
 * Demonstrates the Abstract Factory pattern by creating families of related products (Chair, Sofa).
 */
public class App {
    public static void main(String[] args) {
        // Create a Victorian furniture factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        System.out.println(victorianChair.getDescription());
        System.out.println(victorianSofa.getDescription());

        // Create a Modern furniture factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        System.out.println(modernChair.getDescription());
        System.out.println(modernSofa.getDescription());
    }
}