// Abstraction: Shape
public abstract class Shape {
    protected DrawingPlatform drawingPlatform;

    public Shape(DrawingPlatform drawingPlatform) {
        this.drawingPlatform = drawingPlatform;
    }

    abstract void draw();
}