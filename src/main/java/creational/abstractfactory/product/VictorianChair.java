package creational.abstractfactory.product;

/**
 * VictorianChair is a concrete product for the Abstract Factory pattern.
 */
public class VictorianChair implements Chair {
    @Override
    public String getDescription() {
        return "Victorian Chair";
    }
}