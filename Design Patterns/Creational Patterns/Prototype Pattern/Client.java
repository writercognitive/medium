public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        try {
            Shape clonedCircle = ShapeCache.getShape("circle");
            clonedCircle.setColor("red");
            clonedCircle.draw();

            Shape clonedSquare = ShapeCache.getShape("square");
            clonedSquare.setColor("blue");
            clonedSquare.draw();

            Shape clonedRectangle = ShapeCache.getShape("rectangle");
            clonedRectangle.setColor("green");
            clonedRectangle.draw();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}