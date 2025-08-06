package creational.prototype.product;

/**
 * Rectangle is a concrete prototype for the Prototype pattern.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}