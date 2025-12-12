import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String filePath = "src/words.txt";

        ArrayList<String> words = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }


        String word = words.get(rand.nextInt(words.size()));

        int wrongGuess = 0;

        ArrayList<Character> wordState = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("Welcome to Java Hangman Game!🙃");

        while(wrongGuess < 6){

            System.out.println(getHangmanArt(wrongGuess));

            System.out.print("Word: ");
            for (char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct.");
                for (int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("YOU WIN.");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else{
                System.out.println("Wrong guess.");
                wrongGuess++;
            }
        }
        if (wrongGuess >= 6){
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("GAME OVER.");
            System.out.println("The word was: " + word);
        }
        sc.close();
    }
    static String getHangmanArt(int wrongGuess) {
            return switch (wrongGuess) {
                case 0 -> """
                  +---+
                  |   |
                      |
                      |
                      |
                      |
                =========""";
                case 1 -> """
                  +---+
                  |   |
                  O   |
                      |
                      |
                      |
                =========""";
                case 2 -> """
                  +---+
                  |   |
                  O   |
                  |   |
                      |
                      |
                =========""";
                case 3 -> """
                  +---+
                  |   |
                  O   |
                 /|   |
                      |
                      |
                =========""";
                case 4 -> """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                      |
                      |
                =========""";
                case 5 -> """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 /    |
                      |
                =========""";
                case 6 -> """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 / \\  |
                      |
                =========""";
                default -> "";
            };
        }
}

