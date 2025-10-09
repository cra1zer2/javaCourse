import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        double a;
        double c;
        double b;

        System.out.println("Enter the length A:");
        a=sc.nextDouble();
        System.out.println("Enter the length B:");
        b=sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse is: " + c);
        */

        double radius;
        double circumference;
        double area;
        double volume;
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("\nThe circumference of the circle is %.1f", circumference);
        System.out.printf("\nThe area is %.1f",area);
        System.out.printf("\nThe volume is %.1f", volume);
        //using printf, with ',' instead of '+'. '%.1f' leaves 1 symbol after .

        sc.close();
    }
}
