import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        float balance = 10.99f;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            printLine();
            System.out.println("Welcome to the D Bank Application");
            printLine();
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            printLine();

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
            printLine();
            System.out.println("Thank you for using D Bank Application!\nHave a nice day!");
            printLine();
        }

        scanner.close();
    }
    static void printLine() {
        System.out.println("---------------------------------------");
    }

    static void oneSecondLatency() throws InterruptedException {
        Thread.sleep(1000);
    }

    static void showBalance(float balance) throws InterruptedException {
        printLine();
        System.out.printf("Your balance: %.2f $\n", balance);
        oneSecondLatency();
    }

    static float deposit() throws InterruptedException {

        float amount;

        System.out.println("Enter amount to deposit: ");
        amount = scanner.nextFloat();

        if (amount < 0) {
            System.out.println("Invalid amount");
            oneSecondLatency();
            return 0;
        }
        else{
            oneSecondLatency();
            return amount;
        }
    }

    static float withdraw(float balance) throws InterruptedException {

        float amount;

        System.out.println("Enter amount to withdraw: ");
        amount = scanner.nextFloat();

        if (balance < amount) {
            System.out.println("Not enough balance");
            oneSecondLatency();
            return 0;
        }
        else if(amount < 0) {
            System.out.println("Invalid amount");
            oneSecondLatency();
            return 0;
        }
        else{
            oneSecondLatency();
            return balance - amount;
        }
    }
}
