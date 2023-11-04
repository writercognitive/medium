public interface Shape extends Cloneable {
    void draw();
    void setColor(String color);
    Shape clone() throws CloneNotSupportedException;
}