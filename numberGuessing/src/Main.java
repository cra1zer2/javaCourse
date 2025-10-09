import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int randomNumberMin = 1;
        int randomNumberMax = 10;
        int randomNumber = random.nextInt(randomNumberMin, randomNumberMax + 1);
        //first number is inclusive, second number is exclusive, for example "1, 11" is 1 to 10.
        //(min, max + 1) for readability.

        do{
            System.out.println("Guess a number between 1 and 10:");
            guess = scanner.nextInt();
            attemps++;
        }
        while(guess != randomNumber);

        System.out.printf("You guessed number %d within %d attemps", guess, attemps);

        scanner.close();

    }
}
