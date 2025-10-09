import  java.util.Scanner;
public class Main {
    //psvm to create
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //to clean code declare all at first

        int age;
        double gpa;
        boolean student;

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        //use sc.next() to read till space (1 word of 2)

        System.out.println("Enter your age: ");
        age = sc.nextInt();
        //scanner can use many types of data, like nextInt, nextByte etc.
        //for example

        System.out.println("Enter your gpa: ");
        gpa = sc.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        student = sc.nextBoolean();

        System.out.println("Hello, " + age + " years old " + name + " with " + gpa + " gpa lol");

        if(student){
            System.out.println("Thank you for your visit!");
        }
        else{
            System.out.println("get out.");
        }

        //to clean the input buffer, do:
        sc.nextLine();

        //always close scanner
        sc.close();
    }
}
