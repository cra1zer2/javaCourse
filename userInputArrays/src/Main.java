import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What number of food do you want?");
        int foodNum = sc.nextInt();

        String[] foods = new String[foodNum];

        // to fix the bug, we must clear scanner
        sc.nextLine();


        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter food: ");
            foods[i] = sc.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }
        sc.close();
    }
}
