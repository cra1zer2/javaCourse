import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String response = sc.nextLine().toUpperCase();


        try {
            Day day = Day.valueOf(response);
            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY
                        -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY
                        -> System.out.println("It is the weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid day");
        }

//        System.out.println(day);
//        System.out.println(day.getDayNumber());



        sc.close();
    }
}
