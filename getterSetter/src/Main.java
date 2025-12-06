public class Main {
    public static void main(String[] args) {

        Car car = new Car("Charger", "Yellow", 20449);



        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        // we didn't declare setter for model so we can't change it

        car.setColor("Black");
        car.setPrice(19500);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }

}
