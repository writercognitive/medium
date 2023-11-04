// Client Code
public class ShapeDrawingClient {
    public static void main(String[] args) {
        // Drawing on Windows platform
        DrawingPlatform windowsDrawing = new WindowsDrawing();
        Shape circle = new Circle(windowsDrawing);
        Shape rectangle = new Rectangle(windowsDrawing);

        circle.draw();
        rectangle.draw();

        // Drawing on Linux platform
        DrawingPlatform linuxDrawing = new LinuxDrawing();
        Shape circle2 = new Circle(linuxDrawing);
        Shape rectangle2 = new Rectangle(linuxDrawing);

        circle2.draw();
        rectangle2.draw();
    }
}