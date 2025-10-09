import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        Boolean isStudent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Are you a student? (true/false)");
        isStudent = sc.nextBoolean();


        //group 1
        if(name.isEmpty()) {
            System.out.println("Name is empty 😡");
        }
        else {
            System.out.println("Hello, " + name);
        }

        //group 2
        if(age >= 65) {
            System.out.println("You are a senior");
        }
        else if(age >= 18){
            System.out.println("You are an adult");
        }
        else if (age <= 0){
            System.out.println("You were not born 🫤");
        }
        else {
            System.out.println("You are an child");
        }

        //group 3
        if(isStudent) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not a student");
        }

        sc.close();
    }
}
