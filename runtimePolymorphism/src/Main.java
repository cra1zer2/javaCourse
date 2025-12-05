import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.println("Would you like a dog or cat? (1-cat, 2-dog)");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Cat();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Dog();
            animal.speak();
        }


        sc.close();
    }
}
