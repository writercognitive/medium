public class Rectangle implements Shape {
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}