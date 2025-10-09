import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float principal;
        float rate;
        int timesCompounded;
        int years;
        float amount;

        System.out.println("Enter the principal amount: ");
        principal = sc.nextFloat();

        System.out.println("Enter the interest rate (in %): ");
        rate = sc.nextFloat() / 100;
        // to make 7 -> 0.07 (x times 0.07 -> %'s)

        System.out.println("Enter the # of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.println("Enter the # of years: ");
        years = sc.nextInt();

        amount = (float) (principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years));

        System.out.printf("The amount after %d years is %.2f$\n", years, amount);

        sc.close();
    }
}
