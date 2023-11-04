// Refined Abstraction: Circle
public class Circle extends Shape {
    public Circle(DrawingPlatform drawingPlatform) {
        super(drawingPlatform);
    }

    @Override
    void draw() {
        drawingPlatform.drawCircle();
    }
}