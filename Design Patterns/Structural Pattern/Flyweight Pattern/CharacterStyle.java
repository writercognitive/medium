// Concrete Flyweight: CharacterStyle
public class CharacterStyle implements CharacterFlyweight {
    private String fontFamily;
    private int fontSize;

    public CharacterStyle(String fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    @Override
    public void display() {
        System.out.println("Font Family: " + fontFamily + ", Font Size: " + fontSize);
    }
}