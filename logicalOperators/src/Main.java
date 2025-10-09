import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        float temperature = 20f;
//        boolean weatherIsSunny = false;
//
//        if (temperature <= 30 && temperature >= 0 && weatherIsSunny) {
//            System.out.println("Weather is good");
//            System.out.println("And it is sunny");
//        }
//        else if (temperature <= 30 && temperature >= 0 && !weatherIsSunny) {
//            System.out.println("Weather is good");
//            System.out.println("And it is cloudy");
//        }
//        else if (temperature > 30 || temperature < 0) {
//            System.out.println("Weather is horrible");
//        }


        Scanner sc = new Scanner(System.in);
        String username;

        System.out.println("Enter your username: ");
        username = sc.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("Username must be between 4 and 12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);
        }


        sc.close();
    }
}
