public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerating...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopping...");
    }
}