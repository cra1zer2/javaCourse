public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // abstract

        Vehicle[] vehicles = {car, bike, boat};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

        // or you can use interfaces (don't forget to add access modifier)

        VehicleInterface[] vehicleInterface = {car, bike, boat};
        for (VehicleInterface vehicle : vehicleInterface) {
            vehicle.move();
        }
    }
}
