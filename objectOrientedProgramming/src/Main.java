public class Main {
    public static void main(String[] args) {

        Car car = new Car();

//        System.out.println(car.model);
//        System.out.println(car.make);
//        System.out.println(car.year);
//        System.out.println(car.price);
//
//        System.out.println(car.isRun);
//        // we can change attributes
//        car.isRun = true;
//        System.out.println(car.isRun);

//        System.out.println(car.isRun);
//        car.start();
//        System.out.println(car.isRun);
//        car.stop();
//        System.out.println(car.isRun);

        car.drive();
        car.brake();

        //same thing because same attributes
        Car car2 = new Car();

        System.out.println(car.make + " " + car.model);

        System.out.println(car2.make + " " + car2.model);
    }
}
