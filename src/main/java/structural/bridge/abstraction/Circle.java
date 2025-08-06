package structural.bridge.abstraction;

import structural.bridge.implementor.DrawAPI;

/**
 * Circle is a refined abstraction in the Bridge pattern.
 */
public class Circle extends Shape {
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}