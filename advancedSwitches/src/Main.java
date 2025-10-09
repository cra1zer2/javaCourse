import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String day = sc.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend");
            default ->
                    System.out.println(day + " is not a day");
        }

        sc.close();
    }
}
