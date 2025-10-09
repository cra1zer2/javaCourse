import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        String response = "";
        int age = 0;

        while(name.isEmpty()){
            System.out.println("Please enter your name");
            name = sc.nextLine();
        }

        System.out.printf("Hello, %s", name);

        while(!response.equals("Q")){
            System.out.println("You are playing a game.");
            System.out.println("To quit, press Q");
            response = sc.next().toUpperCase();
        }

        System.out.println("Goodbye!");

        do{
            System.out.println("Please enter your age");
            age = sc.nextInt();
        }
        while(age <= 0);

        int number = 0;

        while (number < 1 || number > 10){
            System.out.println("Please enter a number between 1 and 10");
            number = sc.nextInt();
        }

        System.out.println("You picked " + number);

        sc.close();
    }
}
