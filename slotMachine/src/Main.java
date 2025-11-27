import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float balance = 100f;
        float bet;
        float payout = 0f;
        String [] row;

        printMessage("welcome");

        while (balance > 0) {
            printMessage("balance");
            System.out.print(balance + "$\n");
            printMessage("bet");
            bet = sc.nextFloat();
            // fix the buffer
            sc.nextLine();
            if (bet <= 0 || bet > balance) {
                System.out.println("invalid bet");
            }
            else if(bet > 0 && bet <= balance) {
                balance = balance - bet;
                printMessage("roll");
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);


                if(payout > 0){
                    printMessage("payout");
                    System.out.print(payout + "$\n");
                    balance += payout;
                }
                else {
                    printMessage("nothing");
                }

                printMessage("again");
                String nextChar = sc.nextLine().toUpperCase();

                if(!nextChar.equals("Y")) {
                    if (balance <= 0) {
                        printMessage("lost");
                    }
                    else if (balance > 100){
                        printMessage("won");
                        System.out.print(balance + "$!\n");
                    }
                    else {
                        printMessage("left");
                        System.out.print(balance + "$\n");
                    }
                    break;
                }
            }
            else {
                System.out.println("error");
            }
        }


        // vars
        // welcome message
        // if balance > 0 -> play
            // enter bet amount
            // if bet > balance || bet < 0
                // block
            // bet <= balance
                // balance - bet
                // spin
                // show spin
                // payout (balance + earning)
                // wanna play again? (back to checker)
            // thanks for playing!

        sc.close();
    }

    static String [] spinRow() {
        Random rand = new Random();

        String [] symbols = {"🍋", "🍉", "🍌", "🍒", "⭐️"};
        String [] row = new String[3];

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[rand.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }
    static float getPayout(String[] row, float bet) {
        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]){
                case "🍋" -> bet * 3;
                case "🍉" -> bet * 3;
                case "🍌" -> bet * 2;
                case "🍒" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }

    // harder to read but i js wanted to do this
    public static void printMessage(String command) {
        switch (command.toLowerCase()) {
            case "welcome":
                System.out.println("*********************************");
                System.out.println("Welcome to the slot machine game!");
                System.out.println("     Symbols: 🍋 🍉 🍌 🍒 ⭐️     ");
                System.out.println("*********************************");
                break;
            case "goodbye":
                System.out.println("See you soon!");
                break;
            case "balance":
                System.out.print("Current balance is: ");
                break;
            case "bet":
                System.out.println("Enter your bet amount:");
                break;
            case "roll":
                System.out.println("Rolling...");
                break;
            case "lost":
                System.out.println("You are broke!🫢");
                break;
            case "won":
                System.out.print("You surprisingly earned ");
                break;
            case "payout":
                System.out.print("Your payout is ");
                break;
            case "left":
                System.out.print("You are left with ");
                break;
            case "nothing":
                System.out.println("You won nothing.");
                break;
            case "again":
                System.out.println("Do you want to play again? Y/N");
                break;
            default:
                System.out.println("unknown command " + command);
                break;
        }
    }
}
