// Concrete Implementors: Platform-specific drawing
public class WindowsDrawing implements DrawingPlatform {
    @Override
    public void drawCircle() {
        System.out.println("Drawing a circle on Windows platform.");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Drawing a rectangle on Windows platform.");
    }
}