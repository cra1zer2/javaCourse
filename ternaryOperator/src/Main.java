public class Main {
    public static void main(String[] args) {

        int score = 20;

        /*
        if(score >= 60) {
            System.out.println("Pass.");
        }
        else {
            System.out.println("Fail.");
        }
        */

        //instead for just 1 if/else:

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(score);
        System.out.println(passOrFail);

        int number = 5;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(number);
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfday = (hours <= 12) ? "AM" : "PM";
        System.out.println(hours);
        System.out.println(timeOfday);

        int income = 60000;

        float taxRate = (income >= 40000) ? 0.25f : 0.15f;
        System.out.println(taxRate);
    }
}
