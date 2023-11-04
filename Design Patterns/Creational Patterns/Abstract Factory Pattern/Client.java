public class Client {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();

        modernChair.sitOn();
        modernSofa.lieOn();
        modernCoffeeTable.putCoffee();

        victorianChair.sitOn();
        victorianSofa.lieOn();
        victorianCoffeeTable.putCoffee();
    }
}