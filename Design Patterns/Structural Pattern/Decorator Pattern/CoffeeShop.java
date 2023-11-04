// Client Code
public class CoffeeShop {
    public static void main(String[] args) {
        // Order a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Description: " + simpleCoffee.getDescription());
        System.out.println("Cost: $" + simpleCoffee.getCost());

        // Add milk to the coffee
        Coffee coffeeWithMilk = new Milk(simpleCoffee);
        System.out.println("Description: " + coffeeWithMilk.getDescription());
        System.out.println("Cost: $" + coffeeWithMilk.getCost());

        // Add sugar to the coffee
        Coffee coffeeWithSugar = new Sugar(simpleCoffee);
        System.out.println("Description: " + coffeeWithSugar.getDescription());
        System.out.println("Cost: $" + coffeeWithSugar.getCost());

        // Add both milk and sugar to the coffee
        Coffee coffeeWithMilkAndSugar = new Sugar(new Milk(simpleCoffee));
        System.out.println("Description: " + coffeeWithMilkAndSugar.getDescription());
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.getCost());
    }
}