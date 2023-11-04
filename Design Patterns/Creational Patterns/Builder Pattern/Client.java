public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setSize("Medium")
                .setCrustType("Thin Crust")
                .addTopping("Cheese")
                .addTopping("Mushrooms")
                .addTopping("Pepperoni")
                .build();

        System.out.println("Pizza Details:");
        System.out.println("Size: " + pizza.getSize());
        System.out.println("Crust Type: " + pizza.getCrustType());
        System.out.println("Toppings: " + pizza.getToppings());
    }
}