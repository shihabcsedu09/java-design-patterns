package structural.bridge;

import structural.bridge.abstraction.Circle;
import structural.bridge.implementor.GreenCircle;
import structural.bridge.implementor.RedCircle;

/**
 * Demonstrates the Bridge pattern by drawing circles with different colors.
 */
public class App {
    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}