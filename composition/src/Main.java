public class Main {
    public static void main(String[] args) {
        Car car = new Car("Benz", 2015, "V12");

        System.out.println(car.model);
        System.out.println(car.year);
        // engine is object, type - String.
        System.out.println(car.engine.type);

        car.start();
    }
}
