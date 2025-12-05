public class Boat extends Vehicle implements VehicleInterface {

    @Override
    public void go() {
        System.out.println("You sail the boat");
    }

    @Override
    public void move() {
        System.out.println("You move the boat");
    }
}
