import java.util.List;

public class Pizza {
    private String size;
    private String crustType;
    private List<String> toppings;

    public Pizza(String size, String crustType, List<String> toppings) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String getCrustType() {
        return crustType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    // Other methods...
}
