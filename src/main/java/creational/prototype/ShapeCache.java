package creational.prototype;

import creational.prototype.product.Shape;
import creational.prototype.product.Circle;
import creational.prototype.product.Rectangle;
import creational.prototype.product.Square;
import java.util.Hashtable;

/**
 * ShapeCache stores shape prototypes and allows cloning them.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // For demo: load some shapes into the cache
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}