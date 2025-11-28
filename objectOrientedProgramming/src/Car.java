public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2018;
    float price = 58000.99f;
    boolean isRun =  false;

    void start(){
        isRun = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRun = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }
    void brake(){
        System.out.println("You brake the " + model);
    }
}
