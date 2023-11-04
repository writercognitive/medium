public class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}