// Client Code: TextEditor
public class TextEditor {
    private CharacterFlyweightFactory flyweightFactory;
    private StringBuilder text;

    public TextEditor() {
        flyweightFactory = new CharacterFlyweightFactory();
        text = new StringBuilder();
    }

    public void appendCharacter(char character) {
        CharacterFlyweight flyweight = flyweightFactory.getCharacterFlyweight(character);
        text.append(character);
        flyweight.display(); // Pass the flyweight object itself as the argument
    }

    public void display() {
        System.out.println("Formatted Text: " + text.toString());
    }
}
