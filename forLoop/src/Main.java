import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++){
            System.out.printf("Pizza %d\n", i + 1);
        }
//        for(int i = 9; i >= 0; i--){
//            System.out.printf("Pizza %d\n", i + 1);
//        }
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter loops amount:");
//        int max = scanner.nextInt();
//        for (int i = 0; i < max; i++){
//            System.out.printf("Loop nr %d\n", i + 1);
//        }

        System.out.println("How many seconds to countdown?");
        int seconds = scanner.nextInt();

        for(int i = seconds; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy new year!");

        scanner.close();
    }
}
