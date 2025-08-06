package structural.flyweight;

import structural.flyweight.flyweight.Circle;
import java.util.HashMap;

/**
 * ShapeFactory is the flyweight factory for creating and managing Circle objects.
 */
public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
} 