public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E); //euler

        double result; // math don't work on floats, converting is not stable
        float a = 10;
        /*
        //result = Math.pow(2, 4);

        //like **

        //result = Math.abs(a + 23);
        //if -, makes +. Counts distance from 0.

        //result = Math.sqrt(9);
        //square root

        //result = Math.round(Math.PI);
        //result = Math.floor(Math.PI);
        //result = Math.ceil(Math.PI);
        //round, and to lower, upper value

        //result = Math.max(10, 20);
        //result = Math.min(10, 20);
        //max of numbers, min of numbers.
        */
        result = (a*a*a);
        System.out.println(result);
    }
}
