public class Main {
//    public static void main(String[] args) {
//        String name = "Daniel";
//        int age = 32;
//
//        theHappyBirthday(name, age);
//    }
//    // methods are isolating variables.
//    // theHappyBirthday(name, age)
//    // (String name, int age)
//    // to pass variables
//
//    // we can also rename variables, just keep the order correct.
//    private static void theHappyBirthday(String renamedName, int renamedAge) {
//        String name = "Kevin";
//        int age = 24;
//
//        System.out.printf("Happy Birthday, %s\n", renamedName);
//        System.out.printf("You are %s years old now!\n", renamedAge);
//
//        System.out.printf("Happy Birthday, %s\n", name);
//        System.out.printf("You are %s years old now!\n", age);
//    }
    public static void main(String[] args) {
        double squareResult = square(3);
        System.out.println(squareResult);
        double cubeResult = cube(3);
        System.out.println(cubeResult);
        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

        int age = 18;

        if(ageCheck(age)){
            System.out.println("You may sign up");
        }
        else {
            System.out.println("You may not sign up");
        }
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static Boolean ageCheck(int age) {
        return age >= 18;
        // simpler version of
        // if (age >= 18) {return true} else {return false}
    }
}
