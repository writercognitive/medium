import java.util.HashMap;
import java.util.Map;

// Flyweight Factory: CharacterFlyweightFactory
public class CharacterFlyweightFactory {
    private Map<Character, CharacterFlyweight> characterFlyweights = new HashMap<>();

    public CharacterFlyweight getCharacterFlyweight(char character) {
        // Get existing flyweight or create a new one if not present
        CharacterFlyweight flyweight = characterFlyweights.get(character);
        if (flyweight == null) {
            flyweight = new CharacterStyle("Arial", 12); // Default style for the character
            characterFlyweights.put(character, flyweight);
        }
        return flyweight;
    }
}