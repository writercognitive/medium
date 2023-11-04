// Concrete Decorator: Sugar
public class Sugar implements CoffeeDecorator {
    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.3;
    }
}