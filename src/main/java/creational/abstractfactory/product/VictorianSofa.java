package creational.abstractfactory.product;

/**
 * VictorianSofa is a concrete product for the Abstract Factory pattern.
 */
public class VictorianSofa implements Sofa {
    @Override
    public String getDescription() {
        return "Victorian Sofa";
    }
}