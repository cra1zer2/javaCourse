import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // String fruit = "apple";
        String[] fruitArray = {"apple", "orange", "banana", "kiwi", "grapefruit"};

        // to change element:
        // fruitArray[0] = "pineapple";

        // System.out.println(fruitArray[0]);

        int numOfFruits = fruitArray.length;
        for (int i = 0; i < numOfFruits; i++) {
            System.out.print(fruitArray[i] + " ");
        }

        Arrays.sort(fruitArray);
        // to fill all id's with something:
        // Arrays.fill(fruitArray, "pineapple");

        for (String fruit : fruitArray){
            System.out.print(fruit + " ");
        }
    }
}
