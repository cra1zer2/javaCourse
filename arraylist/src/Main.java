import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        ArrayList<Float> list = new ArrayList<>();
//
//        list.add(1.11f);
//        list.add(2.22f);
//        list.add(3.33f);
//
//        System.out.println(list);
//
//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//        fruits.add("peach");
//        fruits.add("banana");
//        fruits.add("cherry");
//
//        fruits.remove(1);
//
//        fruits.set(0, "pineapple");
//
//
//
//        System.out.println(fruits);
//        System.out.println(fruits.get(1));
//        System.out.println("Array size: " + fruits.size());
//
//        Collections.sort(fruits);
//        System.out.println(fruits);
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//

        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter number of food you would like: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food number " + i + ": ");
            String food = sc.nextLine();
            foods.add(food);
        }

        Collections.sort(foods);

        System.out.println(foods);

        sc.close();

    }
}
