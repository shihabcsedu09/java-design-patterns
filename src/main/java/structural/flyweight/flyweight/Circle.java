package structural.flyweight.flyweight;

import java.util.HashMap;

/**
 * Circle is the flyweight class for the Flyweight pattern.
 */
public class Circle {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y : " + y + ", radius : " + radius);
    }
} 