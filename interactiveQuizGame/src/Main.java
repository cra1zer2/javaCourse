import java.util.Scanner;

public class Main {
    static void main() {
        String [] questions = {
                "What OS is custom? (doesn't come with device pre-installed)",
                "Year of latest epidemy",
                "The most popular OS for personal computers",
                "The most popular OS for servers",
                "What is the name of MacOS core?"
        };
        String [][] options = {
                {"1. OneUI", "2. iOS", "3. PixelExperience", "4. HyperOS"},
                {"1. 2001", "2. 2020", "3. 1956", "4. 1991"},
                {"1. Windows", "2. Linux", "3. MacOS"},
                {"1. Windows", "2. Linux", "3. MacOS"},
                {"1. Windows NT Kernel", "2. Unix", "3. Linux Kernel", "4. XNU"},
        };

        int[] answers = {3, 2, 1, 2, 4};
        int score = 0;
        int realtimeGuess;

        Scanner sc =  new Scanner(System.in);

        printConcoleLine();
        System.out.println("Welcome to the java quiz game!");
        printConcoleLine();

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Your guess: ");
            realtimeGuess = sc.nextInt();

            if(realtimeGuess == answers[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Incorrect!");
            }
        }
        // answers.length to make it universal
        System.out.println("Your score is " + score + " out of " + answers.length);

        sc.close();

    }

    static void printConcoleLine() {
        System.out.println("------------------------------");
    }
}
