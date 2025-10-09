//Weight converter
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float weight;
        int choice;

        System.out.println("Welcome to the weight converter!");
        System.out.println("Enter your weight metrics:");
        System.out.println("1 for kg, 2 for lbs");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter the weight in kilograms:");
            weight = sc.nextFloat();

            weight *= 2.20462F;

            System.out.printf("Your weight is %.1f pounds.", weight);
        }
        else if (choice == 2) {
            System.out.println("Enter the weight in pounds:");
            weight = sc.nextFloat();

            weight *= 0.453592F;

            System.out.printf("Your weight is %.1f kilograms.", weight);
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
