package creational.abstractfactory.factories;

import creational.abstractfactory.product.Chair;
import creational.abstractfactory.product.Sofa;
import creational.abstractfactory.product.ModernChair;
import creational.abstractfactory.product.ModernSofa;

/**
 * ModernFurnitureFactory creates Modern style furniture.
 */
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}