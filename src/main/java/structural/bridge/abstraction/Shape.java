package structural.bridge.abstraction;

import structural.bridge.implementor.DrawAPI;

/**
 * Shape is the abstraction in the Bridge pattern.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}