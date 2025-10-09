import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0; // Initialize result to avoid compile error
        char operator;
        boolean validOperation = true;

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, /, *, ^):");
        operator = sc.next().charAt(0);

        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator.");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("Result = " + result);
        }

        sc.close();
    }
}
