package creational.abstractfactory.product;

/**
 * ModernChair is a concrete product for the Abstract Factory pattern.
 */
public class ModernChair implements Chair {
    @Override
    public String getDescription() {
        return "Modern Chair";
    }
}