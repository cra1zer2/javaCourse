public class Bike extends Vehicle implements VehicleInterface {

    @Override
    void go() {
        System.out.println("You ride the bike");
    }
    @Override
    public  void move() {
        System.out.println("You move the bike");
    }
}
