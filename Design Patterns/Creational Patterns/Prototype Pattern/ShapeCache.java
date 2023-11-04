import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // Load initial prototypes
    public static void loadCache() {
        Circle circle = new Circle("default");
        shapeMap.put("circle", circle);
        Square square = new Square("default");
        shapeMap.put("square", square);
        Rectangle rectangle = new Rectangle("default");
        shapeMap.put("rectangle", rectangle);
    }
}