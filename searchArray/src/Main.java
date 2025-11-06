import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 3, 6, 32, 123};
        int target = 32;
        boolean isFound = false;

        String fruits[] = {"apple", "orange", "pineapple"};

        boolean isFoundF = false;


        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found");
        }

        System.out.println("Enter fruit to find: ");
        String targetF = sc.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(targetF)) {
                System.out.println("Element found at index " + i);
                isFoundF = true;
                break;
            }
        }
        if (!isFoundF) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
