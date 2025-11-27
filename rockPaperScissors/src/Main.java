import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        boolean playAgain;

        do {
            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.print("Enter your move: ");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Wrong choice!");
            } else {
                computerChoice = choices[rand.nextInt(choices.length)];
                System.out.println("Computer's choice: " + computerChoice);

                if (playerChoice.equals(computerChoice)) {
                    System.out.println("Tie");
                } else if (
                        playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                                playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                                playerChoice.equals("paper") && computerChoice.equals("rock")
                ) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }

            playAgain = continuation(sc);

        } while (playAgain);

        System.out.println("Thanks for playing!");

        sc.close();
    }

    static Boolean continuation(Scanner sc) {
        String[] answerPositive = {"yes", "sure", "why not", "absolutely"};
        String userChoice;

        System.out.println("Would you like to play again?");
        userChoice = sc.nextLine().toLowerCase();

        if (Arrays.asList(answerPositive).contains(userChoice)) {
            return true;
        } else {
            System.out.println("Goodbye!");
            return false;
        }
    }
}