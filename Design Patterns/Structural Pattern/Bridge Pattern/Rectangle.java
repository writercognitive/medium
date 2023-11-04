// Refined Abstraction: Rectangle
public class Rectangle extends Shape {
    public Rectangle(DrawingPlatform drawingPlatform) {
        super(drawingPlatform);
    }

    @Override
    void draw() {
        drawingPlatform.drawRectangle();
    }
}