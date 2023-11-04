public class Square implements Shape {
    private String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " square.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Square clone() throws CloneNotSupportedException {
        return (Square) super.clone();
    }
}