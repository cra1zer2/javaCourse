import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This always executes");
        }

        sc.close();
    }
}
