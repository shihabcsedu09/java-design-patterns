package creational.abstractfactory.factories;

import creational.abstractfactory.product.Chair;
import creational.abstractfactory.product.Sofa;

/**
 * FurnitureFactory is the abstract factory interface for creating families of related products.
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}