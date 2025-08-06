package creational.abstractfactory.factories;

import creational.abstractfactory.product.Chair;
import creational.abstractfactory.product.Sofa;
import creational.abstractfactory.product.VictorianChair;
import creational.abstractfactory.product.VictorianSofa;

/**
 * VictorianFurnitureFactory creates Victorian style furniture.
 */
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}