import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String item;
    float price;
    int quantity;
    char currency = '$';
    float total;

    System.out.println("Please enter the item name: ");
    item = sc.nextLine();

    System.out.println("Please enter the item price: ");
    price = sc.nextFloat();

    System.out.println("Please enter the item quantity: ");
    quantity = sc.nextInt();

    total = price * quantity;

    System.out.println("\nYou bought " + quantity + " " + item + "/s for " + total + currency);
    sc.close();
    }
}
