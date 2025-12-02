public class Main {
    static void main(String[] args) {
//        Car car1 = new Car("Mustang", "Red");
//        Car car2 = new Car("Charger", "Blue");
//        Car car3 = new Car("Ford", "Blue");
//        Car car4 = new Car("Ford", "Blue");
//        Car[] cars = {car1, car2, car3, car4};

        // or you can fill array without creating objects separately

        Car[] cars = {
                new Car("Mustang", "Red"),
                new Car("Hellcat", "Black"),
                new Car("Benz", "Red")
        };

        // change attribute for all
        for(Car car : cars){
            car.color = "rgb";
        }

        // display array
        for (Car car : cars) {
            car.drive();
        }

    }
}
