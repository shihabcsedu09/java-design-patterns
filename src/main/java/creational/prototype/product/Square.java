package creational.prototype.product;

/**
 * Square is a concrete prototype for the Prototype pattern.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}