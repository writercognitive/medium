public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        VehicleFactory truckFactory = new TruckFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();

        car.start();
        car.accelerate();
        car.stop();

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        truck.start();
        truck.accelerate();
        truck.stop();
    }
}