package creational.prototype.product;

/**
 * Circle is a concrete prototype for the Prototype pattern.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}