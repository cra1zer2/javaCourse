import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //substring extracts portion of a string
        System.out.println("Enter a email: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.contains(".")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            //String domain = email.substring(7, 16);
            // or just 7, works till end. not flexible

            System.out.println(username);
            System.out.println(domain);

        }
        else{
            System.out.println("Invalid email.");
        }

        sc.close();
    }
}
