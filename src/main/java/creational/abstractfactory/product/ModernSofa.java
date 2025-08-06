package creational.abstractfactory.product;

/**
 * ModernSofa is a concrete product for the Abstract Factory pattern.
 */
public class ModernSofa implements Sofa {
    @Override
    public String getDescription() {
        return "Modern Sofa";
    }
}