import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        columns = sc.nextInt();
        System.out.println("Enter the symbol:");
        symbol = sc.next().charAt(0);

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
