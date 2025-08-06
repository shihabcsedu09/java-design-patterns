package structural.flyweight;

import structural.flyweight.flyweight.Circle;

/**
 * Demonstrates the Flyweight pattern by creating circles with different colors.
 */
public class App {
    private static final String colors[] = { "Red", "Green", "Blue", "Yellow" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
} 