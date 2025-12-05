public class Car extends Vehicle implements VehicleInterface {

    @Override
    void go() {
        System.out.println("You drive the car");
    }

    @Override
    public void move() {
        System.out.println("You move the car");
    }
}
